/**
 * Created by Cornelius on 02.08.2016.
 */
package bimplus.api;

/**
 * Save the short server name.
 */
public enum ServerName {
    Prod,
    Stage,
    Dev,
    LocalHost;

    public int getValue() {
        return this.ordinal();
    }

    public static ServerName forValue(int value) {
        return values()[value];
    }
}
