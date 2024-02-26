#!/bin/bash

# Resta 1 al valor de CI_JOB_ID
previous_job_id=$(($1 - 1))
echo $previous_job_id
