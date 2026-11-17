# Food Ordering System — Java microservices architecture study

A multi-module Java/Spring Boot project exploring order processing with domain-driven design, event-driven messaging and distributed transaction coordination.

**Status:** Architecture/learning project. The complete end-to-end environment has not been independently built and validated for this documentation update.

## Modules

| Directory | Role |
| --- | --- |
| `order-service` | Order domain, application logic, persistence and messaging |
| `payment-service` | Payment domain and messaging |
| `restaurant-service` | Restaurant processing |
| `customer-service` | Customer domain and messaging |
| `common` | Shared application/domain/data access abstractions |
| `infrastructure` | Kafka, Outbox, Docker configuration |

The code includes examples of **DDD, domain events, Saga, Outbox, Kafka, JPA** and separate application/domain/infrastructure responsibilities.

## Technologies

- Java and Spring Boot **2.6.7** (current root `pom.xml`)
- Maven multi-module structure
- Kafka, Avro/schema registry and JPA persistence
- Docker Compose assets in `infrastructure/docker-compose`

## Explore the architecture

- [Root Maven modules](pom.xml)
- [Order domain](order-service/order-domain)
- [Kafka infrastructure](infrastructure/kafka)
- [Outbox infrastructure](infrastructure/outbox)
- [Docker Compose configuration](infrastructure/docker-compose)

## Local setup status

**Setup requires validation:** the services have environment-dependent Kafka and database configuration, and I have not confirmed a clean, one-command end-to-end startup. Before publishing run commands, verify the required JDK, environment variables, database bootstrap, Kafka connectivity, and startup order.

## Tests

The repository contains tests for order service behavior and Saga/payment concurrency cases, but this is not comprehensive end-to-end coverage. No GitHub Actions workflow was identified during the audit.

## Technical debt and roadmap

1. Remove generated/runtime artifacts and Kafka volume data tracked in Git, after verifying there are no valuable files, and update `.gitignore`.
2. Document reproducible setup and one end-to-end order-to-payment demonstration.
3. Add tests for Kafka retries, duplicate events, idempotency and Saga compensation.
4. Add CI and security/dependency scanning.
5. Modernize older dependencies only after checking compatibility.
6. Credit any upstream tutorial or template if this repository was derived from one.

This repository demonstrates architectural exploration, **not a production deployment claim**.
