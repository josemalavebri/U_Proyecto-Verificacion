
package Data.FakeDB.Repository;

import Data.FakeDB.InternalBD;
import Data.Repository;
import java.util.ArrayList;
import modelos.Medico;


public abstract class GenericInternalRepository<T> implements Repository<T> {
    
    protected InternalBD internalBD;
    
    public GenericInternalRepository(){
        internalBD = internalBD.getInstance();
    }
    
}

