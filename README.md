# Spring Rest Client 
Spring rest client making use of Spring Boot and RestTemplates

## Spring Boot random quote
The first example is taken from here: https://spring.io/guides/gs/consuming-rest/

Example of response from restful web service, at this endpoint: http://gturnquist-quoters.cfapps.io/api/random

```xml
{
    "type": "success",
    "value": {
        "id": 3,
        "quote": "Spring has come quite a ways in addressing developer enjoyment and ease of use since the last time I built an application using it."
    }
}
```

Run RandomSpringBootQuoteApplication.java to get one of these random quotes.

## MBTA Restful API
MBTA stands for Massachusetts Bay Transit Authority
Start here: https://api-v3.mbta.com/

Example request to get the schedules between 16:00 (5:00pm) and 16:30 (5:30pm), for the Providence and Worcester commutter rail (trains) lines, at South Station.

    https://api-v3.mbta.com/schedules?filter[stop]=place-sstat&filter[min_time]=16:00&filter[max_time]=16:30&filter[route]=CR-Providence,CR-Worcester
    
Example response, the real response will have multiple sets of data.

```xml
{
    "data": [
        {
            "attributes": {
                "arrival_time": "2018-09-18T16:30:00-04:00",
                "departure_time": "2018-09-18T16:30:00-04:00",
                "drop_off_type": 1,
                "pickup_type": 0,
                "stop_sequence": 1,
                "timepoint": true
            },
            "id": "schedule-CR-Weekday-Spring-18-591-South Station-1",
            "relationships": {
                "prediction": {},
                "route": {
                    "data": {
                        "id": "CR-Worcester",
                        "type": "route"
                    }
                },
                "stop": {
                    "data": {
                        "id": "South Station",
                        "type": "stop"
                    }
                },
                "trip": {
                    "data": {
                        "id": "CR-Weekday-Spring-18-591",
                        "type": "trip"
                    }
                }
            },
            "type": "schedule"
        }
    ],
    "jsonapi": {
        "version": "1.0"
    }
}
```
The code is not working, don't know why.









