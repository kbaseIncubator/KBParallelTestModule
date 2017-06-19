# -*- coding: utf-8 -*-
#BEGIN_HEADER
import random
from pprint import pformat
#END_HEADER


class KBParallelTestModule:
    '''
    Module Name:
    KBParallelTestModule

    Module Description:
    A KBase module: KBParallelTestModule
    '''

    ######## WARNING FOR GEVENT USERS ####### noqa
    # Since asynchronous IO can lead to methods - even the same method -
    # interrupting each other, you must be *very* careful when using global
    # state. A method could easily clobber the state set by another while
    # the latter method is running.
    ######################################### noqa
    VERSION = "0.0.1"
    GIT_URL = ""
    GIT_COMMIT_HASH = ""

    #BEGIN_CLASS_HEADER
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR
        #END_CONSTRUCTOR
        pass


    def do_something(self, ctx, p):
        """
        :param p: instance of type "Params" -> structure: parameter
           "throw_error" of Long, parameter "number" of Long
        :returns: instance of type "Results" -> structure: parameter
           "new_number" of Long
        """
        # ctx is the context object
        # return variables are: r
        #BEGIN do_something
        rid = str(random.randint(1000, 9999))
        print('-(' + rid + ')--Running on p=' + pformat(p))
        if 'throw_error' in p and int(p['throw_error']) == 1:
            raise ValueError('(' + rid + ') doing as you wish')
        new_number = p['number'] * 100
        print('-(' + rid + ')--Computed new number= ' + str(new_number))
        r = {'new_number': new_number, 'rid': rid}
        #END do_something

        # At some point might do deeper type checking...
        if not isinstance(r, dict):
            raise ValueError('Method do_something return value ' +
                             'r is not type dict as required.')
        # return the results
        return [r]
    def status(self, ctx):
        #BEGIN_STATUS
        returnVal = {'state': "OK",
                     'message': "",
                     'version': self.VERSION,
                     'git_url': self.GIT_URL,
                     'git_commit_hash': self.GIT_COMMIT_HASH}
        #END_STATUS
        return [returnVal]
