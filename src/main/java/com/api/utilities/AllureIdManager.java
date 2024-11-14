package com.api.utilities;
import io.qameta.allure.AllureId;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.representer.Representer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;



public class AllureIdManager {

    private static final String FILE_PATH = "test_id_mapping.yaml";
    private static Map<String, String> idMapping;

    static {
        loadMapping();
    }

    private static void loadMapping() {
        try (FileInputStream inputStream = new FileInputStream(FILE_PATH)) {
            Yaml yaml = new Yaml(new Constructor(Map.class));
            idMapping = yaml.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load AllureId mapping file.", e);
        }
    }

    private static void saveMapping() {
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml(options);
        try (FileOutputStream outputStream = new FileOutputStream(FILE_PATH)) {
            yaml.dump(idMapping, outputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save AllureId mapping file.", e);
        }
    }

    public static String getOrCreateAllureId(String testName) {
        if (idMapping.containsKey(testName)) {
            return idMapping.get(testName);
        } else {
            String newId = UUID.randomUUID().toString();
            idMapping.put(testName, newId);
            saveMapping();
            return newId;
        }
    }
}
