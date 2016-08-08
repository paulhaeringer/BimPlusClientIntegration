/*
  Created by Cornelius on 02.08.2016.
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

    public static ServerName get(String value)
    {
            if (value.contains("api-dev"))
            {
                return Dev;
            }
            else if (value.contains("api-stage"))
            {
                return Stage;
            }
            else if (value.contains("localhost"))
            {
                return LocalHost;
            }
            else
            {
                return Prod;
            }
    }
}
