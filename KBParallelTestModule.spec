/*
A KBase module: KBParallelTestModule
*/

module KBParallelTestModule {

    typedef structure {
        int throw_error;
        int number;
    } Params;

    typedef structure {
        int new_number;
    } Results;

    funcdef do_something(Params p) returns (Results r) authentication required;
};
