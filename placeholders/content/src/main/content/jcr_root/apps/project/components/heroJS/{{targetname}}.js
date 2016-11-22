"use strict";

use(function () {

    var CONST = {
        PROP_HERO: "hero"
    }

    var compObj = {};

    var heroProp = granite.resource.properties[CONST.PROP_HERO];;
    if (!heroProp) {
        compObj.hero = "No text saved";
    } else {
        // The actual "hero" content
        compObj.hero = heroProp;
    }

    // Adding the constants to the exposed API
    compObj.CONST = CONST;

    return compObj;
});
