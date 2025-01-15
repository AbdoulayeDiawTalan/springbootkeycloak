Get Keycloak Token:
curl --location 'http://localhost:8080/realms/master/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'client_id=test_client' \
--data-urlencode 'username=admin' \
--data-urlencode 'password=admin'


Calling Admin Api:
curl --location --request GET 'http://localhost:8081/helloAdmin' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer <_past_the_acess_token_>
--data '{
"id":2,
"prenom":"Abdoulaye",
"nom":"Diaw",
"age":100
}'