# Address API Spec

## Create Address

Endpoint : POST /api/contacts/{idContact}/addresses

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "street" : "Jalan",
  "city" : "Kota",
  "province" : "Provinsi",
  "country" : "Negara",
  "postalCode" : "12313"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "id" : "random-string",
    "street" : "Jalan",
    "city" : "Kota",
    "province" : "Provinsi",
    "country" : "Negara",
    "postalCode" : "12313"
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Contact not found"
}
```

## Update Address

Endpoint : PUT /api/contacts/{idContact}/addresses/{idAddress}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "street" : "Jalan",
  "city" : "Kota",
  "province" : "Provinsi",
  "country" : "Negara",
  "postalCode" : "12313"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "id" : "random-string",
    "street" : "Jalan",
    "city" : "Kota",
    "province" : "Provinsi",
    "country" : "Negara",
    "postalCode" : "12313"
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Address not found"
}
```

## Get Address

Endpoint : GET /api/contacts/{idContact}/addresses/{idAddress}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : {
    "id" : "random-string",
    "street" : "Jalan",
    "city" : "Kota",
    "province" : "Provinsi",
    "country" : "Negara",
    "postalCode" : "12313"
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Address not found"
}
```

## Remove Address

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
  "error" : "Address not found"
}
```

## List Address

Endpoint : GET /api/contacts/{idContact}/addresses/{idAddress}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : [
    {
      "id" : "random-string",
      "street" : "Jalan",
      "city" : "Kota",
      "province" : "Provinsi",
      "country" : "Negara",
      "postalCode" : "12313"
    }
  ]
}
```

Response Body (Failed) :

```json
{
  "error" : "Contact not found"
}
```