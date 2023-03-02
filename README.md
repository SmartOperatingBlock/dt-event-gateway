# Digital Twins Event Gateway

![workflow status](https://github.com/smartoperatingblock/dt-event-gateway/actions/workflows/build-and-deploy.yml/badge.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=plastic)](https://opensource.org/licenses/MIT)
![Version](https://img.shields.io/github/v/release/smartoperatingblock/dt-event-gateway?style=plastic)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_dt-event-gateway&metric=bugs)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_dt-event-gateway)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_dt-event-gateway&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_dt-event-gateway)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_dt-event-gateway&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_dt-event-gateway)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_dt-event-gateway&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_dt-event-gateway)

The Event Gateway between Digital Twins and Microservices.

It's responsible to consume events from **Azure Digital Twins** through **Azure SignalR** service and to propagate them to application microservices through a **Kafka Event Broker**.

## Usage
1. Provide a `.env` file with the following variables:
   - BOOTSTRAP_SERVER_URL
   - SCHEMA_REGISTRY_URL
   - SIGNALR_CONNECTION_STRING
2. Run the container with the following command:\
    `docker run ghcr.io/smartoperatingblock/dt-event-gateway:1.2.1`


## Documentation
- Check out the *AsyncAPI* documentation [here](https://smartoperatingblock.github.io/dt-event-gateway/documentation/asyncapi-doc)
- Check out the latest code documentation [here](https://smartoperatingblock.github.io/dt-event-gateway/documentation/code-doc)

---

![](https://raw.githubusercontent.com/SmartOperatingBlock/documentation/main/imgs/dt-event-gateway-schema.svg)
