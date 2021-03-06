package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l f tincan lrs statement ref service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsStatementRefPersistenceImpl
 * @see LFTincanLrsStatementRefUtil
 * @generated
 */
public interface LFTincanLrsStatementRefPersistence extends BasePersistence<LFTincanLrsStatementRef> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFTincanLrsStatementRefUtil} to access the l f tincan lrs statement ref persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the l f tincan lrs statement ref in the entity cache if it is enabled.
    *
    * @param lfTincanLrsStatementRef the l f tincan lrs statement ref
    */
    public void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef lfTincanLrsStatementRef);

    /**
    * Caches the l f tincan lrs statement refs in the entity cache if it is enabled.
    *
    * @param lfTincanLrsStatementRefs the l f tincan lrs statement refs
    */
    public void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef> lfTincanLrsStatementRefs);

    /**
    * Creates a new l f tincan lrs statement ref with the primary key. Does not add the l f tincan lrs statement ref to the database.
    *
    * @param id the primary key for the new l f tincan lrs statement ref
    * @return the new l f tincan lrs statement ref
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef create(
        long id);

    /**
    * Removes the l f tincan lrs statement ref with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan lrs statement ref
    * @return the l f tincan lrs statement ref that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsStatementRefException if a l f tincan lrs statement ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsStatementRefException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef lfTincanLrsStatementRef)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs statement ref with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsStatementRefException} if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs statement ref
    * @return the l f tincan lrs statement ref
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsStatementRefException if a l f tincan lrs statement ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsStatementRefException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs statement ref with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs statement ref
    * @return the l f tincan lrs statement ref, or <code>null</code> if a l f tincan lrs statement ref with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f tincan lrs statement refs.
    *
    * @return the l f tincan lrs statement refs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f tincan lrs statement refs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsStatementRefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs statement refs
    * @param end the upper bound of the range of l f tincan lrs statement refs (not inclusive)
    * @return the range of l f tincan lrs statement refs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f tincan lrs statement refs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsStatementRefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs statement refs
    * @param end the upper bound of the range of l f tincan lrs statement refs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f tincan lrs statement refs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f tincan lrs statement refs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs statement refs.
    *
    * @return the number of l f tincan lrs statement refs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
