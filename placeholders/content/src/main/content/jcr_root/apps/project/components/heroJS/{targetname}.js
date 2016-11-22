"use strict";

use(function () {

    var CONST = {
        PROP_HERO: "hero"
    }

    var compObj = {};

    // The actual "hero" content
    compObj.hero = granite.resource.properties[CONST.PROP_HERO]
            || resourcePage.getProperties().get(CONST.PROP_HERO);

    // Adding the constants to the exposed API
    compObj.CONST = CONST;

    return compObj;

});
