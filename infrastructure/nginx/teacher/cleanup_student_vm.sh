#!/bin/bash
sudo rm -rf  ~/.docker/config.json
sudo rm -rf ~/.ssh/known_hosts
docker rm -f $(docker ps -qa) || true
docker rmi -f $(docker images -qa) || true
history -c && history -w

