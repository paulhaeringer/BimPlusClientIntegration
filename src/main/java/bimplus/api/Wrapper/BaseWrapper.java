package bimplus.api.Wrapper;

/*
  Created by Cornelius on 03.08.2016.
 */

import bimplus.api.ApiCore;

/**
 Base wrapper.
 */
class BaseWrapper
{
    BaseWrapper()
    {
    }

    BaseWrapper(ApiCore apiCore)
    {
        core = apiCore;
        // TeamSession = apiCore.TeamSession;
    }

    ApiCore core;
    // protected TeamSession TeamSession;
}