# Hue Avro Schemas


## Schemas

### Ct

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Ct",
  "fields": [
    {
      "name": "min",
      "type": "long"
    },
    {
      "name": "max",
      "type": "long"
    }
  ]
}
```

### Control

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Control",
  "fields": [
    {
      "name": "mindimlevel",
      "type": "long"
    },
    {
      "name": "maxlumen",
      "type": "long"
    },
    {
      "name": "colorgamuttype",
      "type": ["null", "string"]
    },
    {
      "name": "colorgamut",
      "type": {
        "type": "array",
        "items": {
          "type": "array",
          "items": "double"
        }
      }
    },
    {
      "name": "ct",
      "type": "my.example.hue.Ct"
    }
  ]
}
```

### Streaming

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Streaming",
  "fields": [
    {
      "name": "renderer",
      "type": "boolean"
    },
    {
      "name": "proxy",
      "type": "boolean"
    }
  ]
}
```

### Capabilities

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Capabilities",
  "fields": [
    {
      "name": "certified",
      "type": "boolean"
    },
    {
      "name": "control",
      "type": "my.example.hue.Control"
    },
    {
      "name": "streaming",
      "type": "my.example.hue.Streaming"
    }
  ]
}
```

### Startup

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Startup",
  "fields": [
    {
      "name": "mode",
      "type": "string"
    },
    {
      "name": "configured",
      "type": "boolean"
    }
  ]
}
```


### Config

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Config",
  "fields": [
    {
      "name": "archetype",
      "type": ["null", "string"]
    },
    {
      "name": "function",
      "type": ["null", "string"]
    },
    {
      "name": "direction",
      "type": ["null", "string"]
    },
    {
      "name": "startup",
      "type": "my.example.hue.Startup"
    }
  ]
}
```

### State

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "State",
  "fields": [
    {
      "name": "on",
      "type": "boolean"
    },
    {
      "name": "bri",
      "type": "long"
    },
    {
      "name": "hue",
      "type": "long"
    },
    {
      "name": "sat",
      "type": "long"
    },
    {
      "name": "effect",
      "type": ["null", "string"]
    },
    {
      "name": "xy",
      "type": {
        "type": "array",
        "items": "double"
      }
    },
    {
      "name": "ct",
      "type": ["null", "my.example.hue.Ct"]
    },
    {
      "name": "alert",
      "type": ["null", "string"]
    },
    {
      "name": "colormode",
      "type": ["null", "string"]
    },
    {
      "name": "mode",
      "type": ["null", "string"]
    },
    {
      "name": "reachable",
      "type": "boolean"
    }
  ]
}
```

### SoftwareUpdate

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "SoftwareUpdate",
  "fields": [
    {
      "name": "state",
      "type": "string"
    },
    {
      "name": "lastinstall",
      "type": "string"
    }
  ]
}
```

### Light

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Light",
  "fields": [
    {
      "name": "id",
      "type": "int"
    },
    {
      "name": "state",
      "type": "my.example.hue.State"
    },
    {
      "name": "swupdate",
      "type": "my.example.hue.SoftwareUpdate"
    },
    {
      "name": "type",
      "type": "string"
    },
    {
      "name": "name",
      "type": "string"
    },
    {
      "name": "modelid",
      "type": "string"
    },
    {
      "name": "manufacturername",
      "type": "string"
    },
    {
      "name": "productname",
      "type": "string"
    },
    {
      "name": "capabilities",
      "type": "my.example.hue.Capabilities"
    },
    {
      "name": "config",
      "type": "my.example.hue.Config"
    },
    {
      "name": "uniqueid",
      "type": "string"
    },
    {
      "name": "swversion",
      "type": "string"
    },
    {
      "name": "swconfigid",
      "type": "string"
    },
    {
      "name": "productid",
      "type": "string"
    }
  ]
}
```
### Lights 

```json
{
  "namespace": "my.example.hue",
  "type": "record",
  "name": "Lights",
  "fields": [
    {
      "name": "lights",
      "type": {
        "type": "array",
        "items": {
          "type": "my.example.hue.Light",
          "name": "light"
        }
      }
    }
  ]
}
```

## Generate Avro Java

```shell
java -jar ./avro-tools-1.11.1.jar \
    compile schema  \
    src/main/avro/ct.avsc \
    src/main/avro/control.avsc \
    src/main/avro/streaming.avsc \
    src/main/avro/capabilities.avsc \
    src/main/avro/startup.avsc \
    src/main/avro/config.avsc \
    src/main/avro/state.avsc \
    src/main/avro/swupdate.avsc \
    src/main/avro/light.avsc \
    src/main/avro/lights.avsc \
    src/main/java/my/example/avro
```

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