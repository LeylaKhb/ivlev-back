#!/usr/bin/env bash

mvn clean package

echo 'Copy files...'

scp -i ~/.ssh/id_rsa \
    target/ivlev-back-0.0.1-SNAPSHOT.jar \
    root@178.21.8.74:/root

echo 'Restart server...'

ssh -i ~/.ssh/id_rsa root@178.21.8.74 << EOF

pgrep java | xargs kill -9
nohup /root/.sdkman/candidates/java/current/bin/java -jar ivlev-back-0.0.1-SNAPSHOT.jar > log.txt &

EOF

#echo 'cd te'