package core;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.lang.reflect.Array;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Repository<T> {
    T obj;
    T find(String id){
        return this.obj;
    }

}



enum RDBMS {
    MySQL,
    PostgreSQL,
    MicrosoftSQLServer,
    SQLite,
    H2Database,
    ApacheDerby,
    IBMDB2,
    MariaDB
}


class Database {
    Tuple<RDBMS, String> getRDBMS(){
        return new Tuple<RDBMS, String>();
    }
}

class Tuple<Key, Value> {
    Key key;
    Value value;
}

