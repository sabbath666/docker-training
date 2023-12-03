#!/bin/bash

mkdir -p /tmp/cowsay
touch /tmp/cowsay/default_settings.yml

curl -o /tmp/bellsoft-jre-17.deb http://193.124.113.35:8081/repository/packages/bellsoft-jre-17.deb
sudo dpkg -i /tmp/bellsoft-jre-17.deb
sudo apt-get -f install

mkdir workspace
cd workspace

curl -o cowsay.jar http://193.124.113.35:8081/repository/services/cowsay.jar