# garage
Garage example

Merhaba,

uygulama örnek bir garajı simüle eder. Vale bulunmayan bir otopark gibi düşünülebilir. İçerideki araçlar, araç ayrılmadığı sürece garaj içinde hareket etmez. Yeni giriş yapan araçlar, mevcut araçlar arasında uygun boşluk varsa park edilir. Aksi halde garaj dolu uyarısı verilir.

ÖRNEK RESPONSE MODELLER

park:
{
  "status": 200,
  "explanation": "İşlem Başarılı",
  "result": {
    "ticket": {
      "id": 5,
      "vehicle": {
        "hold": 4,
        "vehicleType": "TRUCK",
        "plate": "34 AAA 447"
      },
      "color": "BLACK",
      "slots": [
        0,
        1,
        2,
        3
      ]
    }
  }
}

leave:
{
  "status": 200,
  "explanation": "İşlem Başarılı",
  "result": {
    "result": "34 AAA 447 garajdan ayrıldı."
  }
}

status:
{
  "status": 200,
  "explanation": "İşlem Başarılı",
  "result": {
    "tickets": [
      {
        "id": 1,
        "vehicle": {
          "hold": 4,
          "vehicleType": "TRUCK",
          "plate": "34 AAA 447"
        },
        "color": "BLACK",
        "slots": [
          5,
          6,
          7,
          8
        ]
      },
      {
        "id": 2,
        "vehicle": {
          "hold": 1,
          "vehicleType": "CAR",
          "plate": "34 AAA 447"
        },
        "color": "BLACK",
        "slots": [
          0
        ]
      },
      {
        "id": 3,
        "vehicle": {
          "hold": 1,
          "vehicleType": "CAR",
          "plate": "34 AAA 447"
        },
        "color": "BLACK",
        "slots": [
          2
        ]
      }
    ]
  }
}


