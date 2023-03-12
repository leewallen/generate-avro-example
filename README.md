# Hue Avro Schemas

Example for creating Avro data using the Philips Hue API resources as the source for the Avro Schemas.

## Run Example

Assuming you have `jq` installed, use the following command:

```shell
./gradlew :run -q  2>/dev/null | jq '.'
```

Or just use:

```shell
./gradlew :run -q  2>/dev/null
```

Example output:

```json
{
  "lights": [
    {
      "id": 1,
      "state": {
        "on": true,
        "bri": 203,
        "hue": 188,
        "sat": 91,
        "effect": "none",
        "xy": [
          0.8750135790325512,
          0.8567189874765607
        ],
        "ct": {
          "min": 1,
          "max": 96
        },
        "alert": null,
        "colormode": null,
        "mode": null,
        "reachable": true
      },
      "swupdate": {
        "state": "aamfgmuclf",
        "lastinstall": "2023-03-11T22:24:03.623698Z"
      },
      "type": "Type_vmlubhzyiv",
      "name": "hdnypbhaok",
      "modelid": "ModelID_rrnwmknodm",
      "manufacturername": "Manufacturer_hdpewubaef",
      "productname": "ProductName_hykfkotsyo",
      "capabilities": {
        "certified": true,
        "control": {
          "mindimlevel": -617595355,
          "maxlumen": 1011010709,
          "colorgamuttype": "zqmgiejjpo",
          "colorgamut": [
            [
              0.20103741247478268,
              0.28561803248099715
            ]
          ],
          "ct": {
            "min": 1,
            "max": 109
          }
        },
        "streaming": {
          "renderer": false,
          "proxy": true
        }
      },
      "config": {
        "archetype": "kxpgojbamx",
        "function": "dacyojxvvu",
        "direction": "xrrtherfhd",
        "startup": {
          "mode": "xtmoxlrjrk",
          "configured": false
        }
      },
      "uniqueid": "7f4bdf3c-5a23-4cb4-9124-1a99f0246b87",
      "swversion": "SWVersion_-63456763ghqpzslaak",
      "swconfigid": "SWVConfig_311895330lsedqyaboa",
      "productid": "ProductID_clomtktyze"
    },
    {
      "id": 2,
      "state": {
        "on": true,
        "bri": 160,
        "hue": 129,
        "sat": 43,
        "effect": "none",
        "xy": [
          0.8006046287795913,
          0.21075542932939828
        ],
        "ct": {
          "min": 1,
          "max": 76
        },
        "alert": null,
        "colormode": null,
        "mode": null,
        "reachable": true
      },
      "swupdate": {
        "state": "miustsgkfx",
        "lastinstall": "2023-03-11T22:24:03.628210Z"
      },
      "type": "Type_dekcfrbjlj",
      "name": "nelhrgsplj",
      "modelid": "ModelID_jpgvzdlcgj",
      "manufacturername": "Manufacturer_dtdvdywpez",
      "productname": "ProductName_icskfebrzq",
      "capabilities": {
        "certified": true,
        "control": {
          "mindimlevel": 719418873,
          "maxlumen": 1178435222,
          "colorgamuttype": "mpiipifqzw",
          "colorgamut": [
            [
              0.41558589761154996,
              0.17443805118891953
            ]
          ],
          "ct": {
            "min": 1,
            "max": 123
          }
        },
        "streaming": {
          "renderer": true,
          "proxy": false
        }
      },
      "config": {
        "archetype": "dqfvfjpfuv",
        "function": "brfpmzutoq",
        "direction": "rxebsmyelx",
        "startup": {
          "mode": "jsariwfzkm",
          "configured": true
        }
      },
      "uniqueid": "704e3435-0b99-4e3e-93ff-7d874358c763",
      "swversion": "SWVersion_919293315llewkmokbh",
      "swconfigid": "SWVConfig_216809058bjyyrxlzvi",
      "productid": "ProductID_whspcvevyh"
    }
  ]
}
```