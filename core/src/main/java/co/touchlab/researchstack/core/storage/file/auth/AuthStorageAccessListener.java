package co.touchlab.researchstack.core.storage.file.auth;
import co.touchlab.researchstack.core.storage.file.StorageAccessListener;

public interface AuthStorageAccessListener <T> extends StorageAccessListener
{
    /**
     * Data access is not ready, needs auth.
     * TODO add bool hasPinCode as a param ?
     */
    void dataAuth(T config);
}