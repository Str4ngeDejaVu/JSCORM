package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for LFTincanLrsAgentProfile. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsAgentProfileLocalServiceUtil
 * @see com.arcusys.learn.persistence.liferay.service.base.LFTincanLrsAgentProfileLocalServiceBaseImpl
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFTincanLrsAgentProfileLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface LFTincanLrsAgentProfileLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFTincanLrsAgentProfileLocalServiceUtil} to access the l f tincan lrs agent profile local service. Add custom service methods to {@link com.arcusys.learn.persistence.liferay.service.impl.LFTincanLrsAgentProfileLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the l f tincan lrs agent profile to the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsAgentProfile the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile that was added
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile addLFTincanLrsAgentProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile lfTincanLrsAgentProfile)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new l f tincan lrs agent profile with the primary key. Does not add the l f tincan lrs agent profile to the database.
    *
    * @param id the primary key for the new l f tincan lrs agent profile
    * @return the new l f tincan lrs agent profile
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile createLFTincanLrsAgentProfile(
        long id);

    /**
    * Deletes the l f tincan lrs agent profile with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile that was removed
    * @throws PortalException if a l f tincan lrs agent profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile deleteLFTincanLrsAgentProfile(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the l f tincan lrs agent profile from the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsAgentProfile the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile deleteLFTincanLrsAgentProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile lfTincanLrsAgentProfile)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile fetchLFTincanLrsAgentProfile(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs agent profile with the primary key.
    *
    * @param id the primary key of the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile
    * @throws PortalException if a l f tincan lrs agent profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile getLFTincanLrsAgentProfile(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f tincan lrs agent profiles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs agent profiles
    * @param end the upper bound of the range of l f tincan lrs agent profiles (not inclusive)
    * @return the range of l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> getLFTincanLrsAgentProfiles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs agent profiles.
    *
    * @return the number of l f tincan lrs agent profiles
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getLFTincanLrsAgentProfilesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the l f tincan lrs agent profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsAgentProfile the l f tincan lrs agent profile
    * @return the l f tincan lrs agent profile that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile updateLFTincanLrsAgentProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile lfTincanLrsAgentProfile)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile createLFTincanLrsActivityProfile(
        java.lang.Integer agentId, java.lang.String profileId,
        java.lang.Integer documentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByProfileId(
        java.lang.String profileId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile> findByAgentId(
        java.lang.Integer agentId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAgentProfileException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile findByAgentIdAndProfileId(
        java.lang.Integer agentId, java.lang.String profileId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
