/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
