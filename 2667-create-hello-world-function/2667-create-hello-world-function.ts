/**
* @return {Function}
 */
var createHelloWorld = function() {
    return function(...args): string {
        return "Hello World";
    };
}


/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */