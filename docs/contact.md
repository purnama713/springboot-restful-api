# Contact API Spec

## Create Contact

Endpoint : POST /api/contacts

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "data" : {
    "id" : "random-string",
    "FirstName" : "Hikari",
    "LastName" : "Miwa",
    "Email" : "miwa@example.com",
    "Phone" : "+1234567890"
  }
}
```

Response Body (Success) :

```json
{
  "data" : {
    "FirstName" : "Hikari",
    "LastName" : "Miwa",
    "Email" : "miwa@example.com",
    "Phone" : "+1234567890"
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Email format invalid, phone number invalid"
}
```

## Update Contact

Endpoint : PUT /api/contacts/{idContact}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "data" : {
    "FirstName" : "Hikari",
    "LastName" : "Miwa",
    "Email" : "miwa@example.com",
    "Phone" : "+1234567890"
  }
}
```

Response Body (Success) :

```json
{
  "data" : {
    "FirstName" : "Hikari",
    "LastName" : "Miwa",
    "Email" : "miwa@example.com",
    "Phone" : "+1234567890"
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Email format invalid, phone number invalid"
}
```

## Get Contact

Endpoint : GET /api/contacts/{idContact}

Request Header : 

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : {
    "FirstName" : "Hikari",
    "LastName" : "Miwa",
    "Email" : "miwa@example.com",
    "Phone" : "+1234567890"
  }
}
```

Response Body (Failed, 404) :

```json
{
  "error" : "Contact not found"
}
```

## Search Contact

Endpoint : GET /api/contacts

Query Param :

- name : String, contact firstname or lastname, using like query, optional
- phone : String, contact phone number, using like query, optional
- email : String, contact email, using like query, optional
- page : Integer, start from 0, default 0
- size : Integer, default 10

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : [
    {
      "id" : "random-string",
      "FirstName" : "Hikari",
      "LastName" : "Miwa",
      "Email" : "miwa@example.com",
      "Phone" : "+1234567890"
    }
  ],
  "paging" : {
    "currectPage" : 0,
    "totalPage" : 10,
    "size" : 10
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Unauthorized"
}
```

## Remove Contact

Endpoint : DELETE /api/contacts/{idContact}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : "OK"
}
```

Response Body (Failed) :

```json
{
  "error" : "Contact not found"
}
```