spring
  flyway: 
    enabled: true
    baseline-on-migrate: true
    baseline-version: 0
    locations:
      - classpath:db/migration
      - classpath:db/seed

      