package dev.emilkorudzhiev.singletonandprototype.prototype_exe;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Database {
    private String databaseName;
    private int[] integers;

    public Database cloneShallow() {
        return new Database(this.databaseName, this.integers);
    }
    public Database cloneDeep() {
        String databaseName = new String(this.databaseName);
        int[] ints = this.integers.clone();
        return new Database(this.databaseName, this.integers);
    }
}
