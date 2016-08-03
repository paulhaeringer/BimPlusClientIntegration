package bimplus.api.Wrapper;

/**
 * Created by Cornelius on 03.08.2016.
 */

import bimplus.api.ApiCore;

/**
 Base wrapper.
 */
public class BaseWrapper
{
    protected BaseWrapper()
    {
    }

    public BaseWrapper(ApiCore apiCore)
    {
        core = apiCore;
        // TeamSession = apiCore.TeamSession;
    }

    protected ApiCore core;
    // protected TeamSession TeamSession;
}