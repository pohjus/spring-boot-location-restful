webpackJsonp(["main"],{

/***/ "../../../../../src/$$_gendir lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "../../../../../src/$$_gendir lazy recursive";

/***/ }),

/***/ "../../../../../src/app/app.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
        this.title = 'locations - app';
        this.dateVar = new Date();
    }
    return AppComponent;
}());
AppComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
        selector: 'app-root',
        template: "<h1>{{title | firstcharuppercase}}</h1>\n  <app-locations></app-locations>",
        styles: [__webpack_require__("../../../../../src/app/app.component.css")]
    })
], AppComponent);

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("../../../platform-browser/@angular/platform-browser.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("../../../common/@angular/common/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/@angular/forms.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__firstcharuppercase_pipe__ = __webpack_require__("../../../../../src/app/firstcharuppercase.pipe.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__locations_location_service__ = __webpack_require__("../../../../../src/app/locations/location.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__locations_locations_component__ = __webpack_require__("../../../../../src/app/locations/locations.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__map_map_component__ = __webpack_require__("../../../../../src/app/map/map.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__agm_core__ = __webpack_require__("../../../../@agm/core/index.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};










var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_3__angular_core__["L" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_4__app_component__["a" /* AppComponent */],
            __WEBPACK_IMPORTED_MODULE_5__firstcharuppercase_pipe__["a" /* FirstCharUpperCasePipe */],
            __WEBPACK_IMPORTED_MODULE_7__locations_locations_component__["a" /* LocationsComponent */],
            __WEBPACK_IMPORTED_MODULE_8__map_map_component__["a" /* MapComponent */]
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */], __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["b" /* HttpClientModule */], __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
            __WEBPACK_IMPORTED_MODULE_9__agm_core__["a" /* AgmCoreModule */].forRoot({
                apiKey: 'AIzaSyAvXgP8OLIcqJChfTCJhBHqXHF2SGlK6NY'
            }),
        ],
        providers: [__WEBPACK_IMPORTED_MODULE_6__locations_location_service__["a" /* LocationService */]],
        bootstrap: [__WEBPACK_IMPORTED_MODULE_4__app_component__["a" /* AppComponent */]]
    })
], AppModule);

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ "../../../../../src/app/firstcharuppercase.pipe.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FirstCharUpperCasePipe; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var FirstCharUpperCasePipe = (function () {
    function FirstCharUpperCasePipe() {
    }
    FirstCharUpperCasePipe.prototype.transform = function (giventext) {
        var firstChar = giventext.charAt(0).toUpperCase();
        var rest = giventext.slice(1, giventext.length).toLowerCase();
        var returnValue = firstChar + rest;
        return returnValue;
    };
    return FirstCharUpperCasePipe;
}());
FirstCharUpperCasePipe = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["V" /* Pipe */])({ name: 'firstcharuppercase' })
], FirstCharUpperCasePipe);

//# sourceMappingURL=firstcharuppercase.pipe.js.map

/***/ }),

/***/ "../../../../../src/app/locations/location.interface.ts":
/***/ (function(module, exports) {

//# sourceMappingURL=location.interface.js.map

/***/ }),

/***/ "../../../../../src/app/locations/location.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LocationService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("../../../common/@angular/common/http.es5.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var LocationService = (function () {
    function LocationService(http) {
        this.http = http;
    }
    LocationService.prototype.fetch = function (callback) {
        this.http.get('http://localhost:8080/api/locations/').subscribe(function (jsonObject) {
            callback(jsonObject);
        });
    };
    LocationService.prototype.post = function (callback, locationObject) {
        var url = 'http://localhost:8080/api/locations/';
        this.http.post(url, locationObject).subscribe(function (result) {
            callback(result);
        });
    };
    LocationService.prototype.delete = function (callback, id) {
        var url = 'http://localhost:8080/api/locations/' + id;
        this.http.delete(url, { observe: 'response', responseType: 'text' }).subscribe(function (response) {
            callback(response.status);
        });
    };
    return LocationService;
}());
LocationService = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Injectable */])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */]) === "function" && _a || Object])
], LocationService);

var _a;
//# sourceMappingURL=location.service.js.map

/***/ }),

/***/ "../../../../../src/app/locations/locations.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "table {\n  width: 100%;\n  border: 1px solid gray;\n  padding: 0px;\n  margin: 0px;\n}\n\ntd, tr, th {\n  font-family: Arial;\n  border: 1px solid gray;\n}\n\ninput {\n  width: 100%\n}\n\nth {\n  background: lightgray\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/locations/locations.component.html":
/***/ (function(module, exports) {

module.exports = "<app-map (onMapsClicked)=\"addCoordinates($event)\" [locations]=\"locations\" [zoomIntoLocation]=\"zoomIntoLocation\"></app-map>\n<table class=\"pure-table\">\n    <thead>\n        <tr>\n           <th>#</th>\n           <th>Latitude</th>\n           <th>Longitude</th>\n           <th>Action</th>\n          </tr>\n    </thead>\n    <tbody>\n        <tr *ngFor=\"let location of locations\">\n          <td>{{location.id}}</td><td>{{location.latitude}}</td><td>{{location.longitude}}</td><td><button (click)=\"delete(location.id)\">Delete</button></td>\n        </tr>\n        <tr>\n            <td></td>\n            <td><input type=\"number\" [(ngModel)]=\"latitude\" placeholder=\"latitude\"/></td>\n            <td><input type=\"number\" [(ngModel)]=\"longitude\"  placeholder=\"longitude\"/></td>\n            <td><button (click)=\"add()\">Add New</button></td>          \n        </tr>  \n      </tbody>\n</table>\n"

/***/ }),

/***/ "../../../../../src/app/locations/locations.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LocationsComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__location_service__ = __webpack_require__("../../../../../src/app/locations/location.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var LocationsComponent = (function () {
    // constructor vs init?
    function LocationsComponent(locationService) {
        this.zoomIntoLocation = { id: 1, latitude: 60, longitude: 60 };
        this.locationService = locationService;
    }
    LocationsComponent.prototype.addCoordinates = function (event) {
        console.log(event);
        this.latitude = event.coords.lat;
        this.longitude = event.coords.lng;
        this.add();
    };
    LocationsComponent.prototype.add = function () {
        var _this = this;
        var object = { "latitude": this.latitude, "longitude": this.longitude };
        // TODO IF WRONG
        // VALIDATION!!
        this.locationService.post(function (result) {
            _this.locations.push(result);
            _this.latitude = '';
            _this.longitude = '';
            _this.zoomIntoLocation = result;
        }, object);
    };
    LocationsComponent.prototype.deleteLocInCache = function (id) {
        var indexToBeRemoved;
        var flag = true;
        for (var i = 0; i < this.locations.length && flag; i++) {
            if (this.locations[i].id == id) {
                indexToBeRemoved = i;
                flag = false;
            }
        }
        this.locations.splice(indexToBeRemoved, 1);
    };
    LocationsComponent.prototype.delete = function (id) {
        var _this = this;
        this.locationService.delete(function (status) {
            if (status != 200) {
                alert("problem deleting");
            }
            else {
                _this.deleteLocInCache(id);
            }
        }, id);
    };
    LocationsComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.locationService.fetch(function (result) {
            _this.locations = result;
            _this.zoomIntoLocation = _this.locations[_this.locations.length - 1];
        });
    };
    return LocationsComponent;
}());
LocationsComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
        selector: 'app-locations',
        template: __webpack_require__("../../../../../src/app/locations/locations.component.html"),
        styles: [__webpack_require__("../../../../../src/app/locations/locations.component.css")]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__location_service__["a" /* LocationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__location_service__["a" /* LocationService */]) === "function" && _a || Object])
], LocationsComponent);

var _a;
//# sourceMappingURL=locations.component.js.map

/***/ }),

/***/ "../../../../../src/app/map/map.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "agm-map {\n  height: 300px;\n  padding: 1em;\n}\n\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/map/map.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- this creates a google map on the page with the given lat/lng from -->\n<!-- the component as the initial center of the map: -->\n<div id=\"right\">\n<agm-map \n       [disableDoubleClickZoom]=\"true\" \n       (mapDblClick)=\"addNew($event)\" \n       [usePanning]=\"true\"\n       [latitude]=\"zoomIntoLocation.latitude\" \n       [longitude]=\"zoomIntoLocation.longitude\">\n  <agm-marker *ngFor=\"let location of locations\" [latitude]=\"location.latitude\" [longitude]=\"location.longitude\"></agm-marker>\n</agm-map>\n</div>"

/***/ }),

/***/ "../../../../../src/app/map/map.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MapComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__locations_location_interface__ = __webpack_require__("../../../../../src/app/locations/location.interface.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__locations_location_interface___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1__locations_location_interface__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var MapComponent = (function () {
    function MapComponent() {
        this.onMapsClicked = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["w" /* EventEmitter */]();
    }
    MapComponent.prototype.addNew = function (event) {
        this.onMapsClicked.emit(event);
    };
    MapComponent.prototype.ngOnInit = function () {
    };
    return MapComponent;
}());
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["E" /* Input */])(),
    __metadata("design:type", Array)
], MapComponent.prototype, "locations", void 0);
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["E" /* Input */])(),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__locations_location_interface__["Location"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__locations_location_interface__["Location"]) === "function" && _a || Object)
], MapComponent.prototype, "zoomIntoLocation", void 0);
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* Output */])(),
    __metadata("design:type", Object)
], MapComponent.prototype, "onMapsClicked", void 0);
MapComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
        selector: 'app-map',
        template: __webpack_require__("../../../../../src/app/map/map.component.html"),
        styles: [__webpack_require__("../../../../../src/app/map/map.component.css")]
    }),
    __metadata("design:paramtypes", [])
], MapComponent);

var _a;
//# sourceMappingURL=map.component.js.map

/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
// The file contents for the current environment will overwrite these during build.
var environment = {
    production: false
};
//# sourceMappingURL=environment.js.map

/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/@angular/platform-browser-dynamic.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_20" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });
//# sourceMappingURL=main.js.map

/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map