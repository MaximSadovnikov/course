#!/usr/bin/env bash
if [ $# -eq 0 ]
  then
    tag='latest'
  else
    tag=$1
fi

docker build -t vxvw_app:"$tag" app

echo "Docker image with tag vxvw_app:$tag created"

echo "Starting app and forward to localhost:8080"

docker run -p 8080:8080 vxvw_app:"$tag" -d
