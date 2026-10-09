package oop.assigment_problems;

interface StorageService {
    void save(String key, String data);
    String retrieve(String key);
}

class LocalStorage implements StorageService {
    public void save(String key, String data) {
        System.out.println("Saved locally to disk: [" + key + "] -> " + data);
    }
    public String retrieve(String key) {
        return "local-data-for-" + key;
    }
}

class CloudStorage implements StorageService {
    public void save(String key, String data) {
        System.out.println("Uploaded to S3 bucket: [" + key + "] -> " + data);
    }
    public String retrieve(String key) {
        return "cloud-data-for-" + key;
    }
}

public class StorageBackend {
    public static void main(String[] args) {
        StorageService s1 = new LocalStorage();
        StorageService s2 = new CloudStorage();
        s1.save("doc1", "pdf-bytes");
        s2.save("doc2", "pdf-bytes");
    }
}
