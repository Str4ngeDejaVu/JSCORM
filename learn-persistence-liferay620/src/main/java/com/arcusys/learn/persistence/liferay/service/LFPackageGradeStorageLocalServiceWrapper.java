package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LFPackageGradeStorageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LFPackageGradeStorageLocalService
 * @generated
 */
public class LFPackageGradeStorageLocalServiceWrapper
    implements LFPackageGradeStorageLocalService,
        ServiceWrapper<LFPackageGradeStorageLocalService> {
    private LFPackageGradeStorageLocalService _lfPackageGradeStorageLocalService;

    public LFPackageGradeStorageLocalServiceWrapper(
        LFPackageGradeStorageLocalService lfPackageGradeStorageLocalService) {
        _lfPackageGradeStorageLocalService = lfPackageGradeStorageLocalService;
    }

    /**
    * Adds the l f package grade storage to the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageGradeStorage the l f package grade storage
    * @return the l f package grade storage that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage addLFPackageGradeStorage(
        com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage lfPackageGradeStorage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.addLFPackageGradeStorage(lfPackageGradeStorage);
    }

    /**
    * Creates a new l f package grade storage with the primary key. Does not add the l f package grade storage to the database.
    *
    * @param lfPackageGradeStoragePK the primary key for the new l f package grade storage
    * @return the new l f package grade storage
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage createLFPackageGradeStorage(
        com.arcusys.learn.persistence.liferay.service.persistence.LFPackageGradeStoragePK lfPackageGradeStoragePK) {
        return _lfPackageGradeStorageLocalService.createLFPackageGradeStorage(lfPackageGradeStoragePK);
    }

    /**
    * Deletes the l f package grade storage with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageGradeStoragePK the primary key of the l f package grade storage
    * @return the l f package grade storage that was removed
    * @throws PortalException if a l f package grade storage with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage deleteLFPackageGradeStorage(
        com.arcusys.learn.persistence.liferay.service.persistence.LFPackageGradeStoragePK lfPackageGradeStoragePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.deleteLFPackageGradeStorage(lfPackageGradeStoragePK);
    }

    /**
    * Deletes the l f package grade storage from the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageGradeStorage the l f package grade storage
    * @return the l f package grade storage that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage deleteLFPackageGradeStorage(
        com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage lfPackageGradeStorage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.deleteLFPackageGradeStorage(lfPackageGradeStorage);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfPackageGradeStorageLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageGradeStorageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageGradeStorageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage fetchLFPackageGradeStorage(
        com.arcusys.learn.persistence.liferay.service.persistence.LFPackageGradeStoragePK lfPackageGradeStoragePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.fetchLFPackageGradeStorage(lfPackageGradeStoragePK);
    }

    /**
    * Returns the l f package grade storage with the primary key.
    *
    * @param lfPackageGradeStoragePK the primary key of the l f package grade storage
    * @return the l f package grade storage
    * @throws PortalException if a l f package grade storage with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage getLFPackageGradeStorage(
        com.arcusys.learn.persistence.liferay.service.persistence.LFPackageGradeStoragePK lfPackageGradeStoragePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.getLFPackageGradeStorage(lfPackageGradeStoragePK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f package grade storages.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageGradeStorageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f package grade storages
    * @param end the upper bound of the range of l f package grade storages (not inclusive)
    * @return the range of l f package grade storages
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage> getLFPackageGradeStorages(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.getLFPackageGradeStorages(start,
            end);
    }

    /**
    * Returns the number of l f package grade storages.
    *
    * @return the number of l f package grade storages
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLFPackageGradeStoragesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.getLFPackageGradeStoragesCount();
    }

    /**
    * Updates the l f package grade storage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPackageGradeStorage the l f package grade storage
    * @return the l f package grade storage that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage updateLFPackageGradeStorage(
        com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage lfPackageGradeStorage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.updateLFPackageGradeStorage(lfPackageGradeStorage);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lfPackageGradeStorageLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfPackageGradeStorageLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfPackageGradeStorageLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageGradeStorage findGrade(
        long userId, long packageId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageGradeStorageException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageGradeStorageLocalService.findGrade(userId, packageId);
    }

    @Override
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfPackageGradeStorageLocalService.removeAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LFPackageGradeStorageLocalService getWrappedLFPackageGradeStorageLocalService() {
        return _lfPackageGradeStorageLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLFPackageGradeStorageLocalService(
        LFPackageGradeStorageLocalService lfPackageGradeStorageLocalService) {
        _lfPackageGradeStorageLocalService = lfPackageGradeStorageLocalService;
    }

    @Override
    public LFPackageGradeStorageLocalService getWrappedService() {
        return _lfPackageGradeStorageLocalService;
    }

    @Override
    public void setWrappedService(
        LFPackageGradeStorageLocalService lfPackageGradeStorageLocalService) {
        _lfPackageGradeStorageLocalService = lfPackageGradeStorageLocalService;
    }
}
