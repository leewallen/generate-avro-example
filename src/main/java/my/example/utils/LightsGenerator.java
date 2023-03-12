package my.example.utils;

import my.example.hue.SoftwareUpdate;
import my.example.hue.Light;
import my.example.hue.Lights;
import my.example.hue.Config;
import my.example.hue.Ct;
import my.example.hue.Streaming;
import my.example.hue.Startup;
import my.example.hue.State;
import my.example.hue.Control;
import my.example.hue.Capabilities;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class LightsGenerator {
    static final Random random = new Random();

    private LightsGenerator() {}
    public static Lights makeLights(int numLights) {
        List<Light> lightsList = new ArrayList<>(numLights);
        for (int idx = 0; idx <= numLights; idx++) {
            lightsList.add(makeLight(idx+1));
        }

        return Lights.newBuilder().setLights(lightsList).build();

    }
    public static Light makeLight(int id) {
        return Light.newBuilder()
                .setName(makeRandomString())
                .setId(id)
                .setModelid(makeRandomString("ModelID_"))
                .setProductid(makeRandomString("ProductID_"))
                .setProductname(makeRandomString("ProductName_"))
                .setManufacturername(makeRandomString("Manufacturer_"))
                .setSwconfigid(makeRandomString(String.format("SWVConfig_%s", makeRandomInt())))
                .setSwversion(makeRandomString(String.format("SWVersion_%s", makeRandomInt())))
                .setUniqueid(UUID.randomUUID().toString())
                .setType(makeRandomString("Type_"))
                .setState(makeState())
                .setCapabilities(makeCapabilites())
                .setConfig(makeConfig())
                .setSwupdate(makeSoftwareUpdate())
                .build();
    }

    private static SoftwareUpdate makeSoftwareUpdate() {
        return SoftwareUpdate.newBuilder()
                .setState(makeRandomString())
                .setLastinstall(Instant.now().toString())
                .build();
    }


    private static Config makeConfig() {
        return Config.newBuilder()
                .setArchetype(makeRandomString())
                .setDirection(makeRandomString())
                .setFunction(makeRandomString())
                .setStartup(makeStartup())
                .build();
    }

    private static Startup makeStartup() {
        return Startup.newBuilder()
                .setConfigured(random.nextBoolean())
                .setMode(makeRandomString())
                .build();
    }

    private static Capabilities makeCapabilites() {
        return Capabilities.newBuilder()
                .setCertified(random.nextBoolean())
                .setControl(makeControl())
                .setStreaming(makeStreaming())
                .build();
    }

    private static Streaming makeStreaming() {
        return Streaming.newBuilder()
                .setProxy(random.nextBoolean())
                .setRenderer(random.nextBoolean())
                .build();
    }

    private static Control makeControl() {
        var doubles = new ArrayList<Double>();
        doubles.add(random.nextDouble());
        doubles.add(random.nextDouble());
        List<List<Double>> doublesList = new ArrayList<>();
        doublesList.add(doubles);
        return Control.newBuilder()
                .setMaxlumen(makeRandomInt())
                .setMindimlevel(makeRandomInt())
                .setColorgamut(doublesList)
                .setCt(makeCt())
                .setColorgamuttype(makeRandomString())
                .build();
    }

    private static Ct makeCt() {
        return Ct.newBuilder()
                .setMin(1)
                .setMax(makeRandomInt(128))
                .build();
    }

    private static State makeState() {
        var xyList = new ArrayList<Double>();
        xyList.add(random.nextDouble());
        xyList.add(random.nextDouble());
        return State.newBuilder()
                .setBri(makeRandomInt(255))
                .setCt(makeCt())
                .setHue(makeRandomInt(255))
                .setOn(random.nextBoolean())
                .setReachable(random.nextBoolean())
                .setSat(makeRandomInt(255))
                .setXy(xyList)
                .setAlert(null)
                .setEffect("none")
                .setColormode(null)
                .setMode(null)
                .build();
    }

    private static int makeRandomInt(int maxValue) {
        if (maxValue == 0)
            return random.nextInt();
        return random.nextInt(maxValue);
    }

    private static int makeRandomInt() {
        return makeRandomInt(0);
    }


    private static String makeRandomString(String prefix) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        StringBuilder buffer = new StringBuilder(targetStringLength);

        if (prefix != null) buffer.append(prefix);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * ((rightLimit - leftLimit) + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    private static String makeRandomString() {
        return makeRandomString(null);
    }
}
