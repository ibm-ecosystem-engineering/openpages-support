#!/bin/sh

TARGET=$1

mkdir -p "${TARGET}"

cp /op-ext-lib/* "${TARGET}"
