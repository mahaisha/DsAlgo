#!/bin/bash
set -ex
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb && ls && sudo dpkg -i google-chrome-stable_current_amd64.deb && echo "Done"
