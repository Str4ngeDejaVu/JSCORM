package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsSubStatementException;
import com.arcusys.learn.persistence.liferay.model.LFTincanLrsSubStatement;
import com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsSubStatementImpl;
import com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsSubStatementModelImpl;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityDataMapPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStateNodePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStateTreePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAnswerPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAttemptDataPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAttemptPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFBigDecimalPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFCertificatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFCertificateSitePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFCertificateUserPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFChildrenSelectionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFConditionRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFConfigPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFCoursePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFFileStoragePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFGlobalObjectiveStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectiveMapPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectivePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectiveStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackageCommentPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackagePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackageScopeRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackageVotePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPlayerScopeRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuestionCategoryPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuestionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizQuestionCategoryPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizQuestionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFResourcePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRolePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRollupContributionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRollupRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRuleConditionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingPermissionsPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingTrackingPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSocialPackagePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSocialPackageTagPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanActivityPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanActorPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsActivityProfilePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsAgentProfilePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsAttachmentPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsContextActivitiesPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsContextPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsDocumentPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsEndpointPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsResultPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsStatementPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsStatementRefPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanLrsSubStatementPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanManifestActivityPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFTincanPackagePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFUserPersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the l f tincan lrs sub statement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsSubStatementPersistence
 * @see LFTincanLrsSubStatementUtil
 * @generated
 */
public class LFTincanLrsSubStatementPersistenceImpl extends BasePersistenceImpl<LFTincanLrsSubStatement>
    implements LFTincanLrsSubStatementPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LFTincanLrsSubStatementUtil} to access the l f tincan lrs sub statement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LFTincanLrsSubStatementImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
            LFTincanLrsSubStatementModelImpl.FINDER_CACHE_ENABLED,
            LFTincanLrsSubStatementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
            LFTincanLrsSubStatementModelImpl.FINDER_CACHE_ENABLED,
            LFTincanLrsSubStatementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
            LFTincanLrsSubStatementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LFTINCANLRSSUBSTATEMENT = "SELECT lfTincanLrsSubStatement FROM LFTincanLrsSubStatement lfTincanLrsSubStatement";
    private static final String _SQL_COUNT_LFTINCANLRSSUBSTATEMENT = "SELECT COUNT(lfTincanLrsSubStatement) FROM LFTincanLrsSubStatement lfTincanLrsSubStatement";
    private static final String _ORDER_BY_ENTITY_ALIAS = "lfTincanLrsSubStatement.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LFTincanLrsSubStatement exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LFTincanLrsSubStatementPersistenceImpl.class);
    private static LFTincanLrsSubStatement _nullLFTincanLrsSubStatement = new LFTincanLrsSubStatementImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LFTincanLrsSubStatement> toCacheModel() {
                return _nullLFTincanLrsSubStatementCacheModel;
            }
        };

    private static CacheModel<LFTincanLrsSubStatement> _nullLFTincanLrsSubStatementCacheModel =
        new CacheModel<LFTincanLrsSubStatement>() {
            public LFTincanLrsSubStatement toEntityModel() {
                return _nullLFTincanLrsSubStatement;
            }
        };

    @BeanReference(type = LFActivityPersistence.class)
    protected LFActivityPersistence lfActivityPersistence;
    @BeanReference(type = LFActivityDataMapPersistence.class)
    protected LFActivityDataMapPersistence lfActivityDataMapPersistence;
    @BeanReference(type = LFActivityStatePersistence.class)
    protected LFActivityStatePersistence lfActivityStatePersistence;
    @BeanReference(type = LFActivityStateNodePersistence.class)
    protected LFActivityStateNodePersistence lfActivityStateNodePersistence;
    @BeanReference(type = LFActivityStateTreePersistence.class)
    protected LFActivityStateTreePersistence lfActivityStateTreePersistence;
    @BeanReference(type = LFAnswerPersistence.class)
    protected LFAnswerPersistence lfAnswerPersistence;
    @BeanReference(type = LFAttemptPersistence.class)
    protected LFAttemptPersistence lfAttemptPersistence;
    @BeanReference(type = LFAttemptDataPersistence.class)
    protected LFAttemptDataPersistence lfAttemptDataPersistence;
    @BeanReference(type = LFBigDecimalPersistence.class)
    protected LFBigDecimalPersistence lfBigDecimalPersistence;
    @BeanReference(type = LFCertificatePersistence.class)
    protected LFCertificatePersistence lfCertificatePersistence;
    @BeanReference(type = LFCertificateSitePersistence.class)
    protected LFCertificateSitePersistence lfCertificateSitePersistence;
    @BeanReference(type = LFCertificateUserPersistence.class)
    protected LFCertificateUserPersistence lfCertificateUserPersistence;
    @BeanReference(type = LFChildrenSelectionPersistence.class)
    protected LFChildrenSelectionPersistence lfChildrenSelectionPersistence;
    @BeanReference(type = LFConditionRulePersistence.class)
    protected LFConditionRulePersistence lfConditionRulePersistence;
    @BeanReference(type = LFConfigPersistence.class)
    protected LFConfigPersistence lfConfigPersistence;
    @BeanReference(type = LFCoursePersistence.class)
    protected LFCoursePersistence lfCoursePersistence;
    @BeanReference(type = LFFileStoragePersistence.class)
    protected LFFileStoragePersistence lfFileStoragePersistence;
    @BeanReference(type = LFGlobalObjectiveStatePersistence.class)
    protected LFGlobalObjectiveStatePersistence lfGlobalObjectiveStatePersistence;
    @BeanReference(type = LFObjectivePersistence.class)
    protected LFObjectivePersistence lfObjectivePersistence;
    @BeanReference(type = LFObjectiveMapPersistence.class)
    protected LFObjectiveMapPersistence lfObjectiveMapPersistence;
    @BeanReference(type = LFObjectiveStatePersistence.class)
    protected LFObjectiveStatePersistence lfObjectiveStatePersistence;
    @BeanReference(type = LFPackagePersistence.class)
    protected LFPackagePersistence lfPackagePersistence;
    @BeanReference(type = LFPackageCommentPersistence.class)
    protected LFPackageCommentPersistence lfPackageCommentPersistence;
    @BeanReference(type = LFPackageScopeRulePersistence.class)
    protected LFPackageScopeRulePersistence lfPackageScopeRulePersistence;
    @BeanReference(type = LFPackageVotePersistence.class)
    protected LFPackageVotePersistence lfPackageVotePersistence;
    @BeanReference(type = LFPlayerScopeRulePersistence.class)
    protected LFPlayerScopeRulePersistence lfPlayerScopeRulePersistence;
    @BeanReference(type = LFQuestionPersistence.class)
    protected LFQuestionPersistence lfQuestionPersistence;
    @BeanReference(type = LFQuestionCategoryPersistence.class)
    protected LFQuestionCategoryPersistence lfQuestionCategoryPersistence;
    @BeanReference(type = LFQuizPersistence.class)
    protected LFQuizPersistence lfQuizPersistence;
    @BeanReference(type = LFQuizQuestionPersistence.class)
    protected LFQuizQuestionPersistence lfQuizQuestionPersistence;
    @BeanReference(type = LFQuizQuestionCategoryPersistence.class)
    protected LFQuizQuestionCategoryPersistence lfQuizQuestionCategoryPersistence;
    @BeanReference(type = LFResourcePersistence.class)
    protected LFResourcePersistence lfResourcePersistence;
    @BeanReference(type = LFRolePersistence.class)
    protected LFRolePersistence lfRolePersistence;
    @BeanReference(type = LFRollupContributionPersistence.class)
    protected LFRollupContributionPersistence lfRollupContributionPersistence;
    @BeanReference(type = LFRollupRulePersistence.class)
    protected LFRollupRulePersistence lfRollupRulePersistence;
    @BeanReference(type = LFRuleConditionPersistence.class)
    protected LFRuleConditionPersistence lfRuleConditionPersistence;
    @BeanReference(type = LFSequencingPersistence.class)
    protected LFSequencingPersistence lfSequencingPersistence;
    @BeanReference(type = LFSequencingPermissionsPersistence.class)
    protected LFSequencingPermissionsPersistence lfSequencingPermissionsPersistence;
    @BeanReference(type = LFSequencingTrackingPersistence.class)
    protected LFSequencingTrackingPersistence lfSequencingTrackingPersistence;
    @BeanReference(type = LFSocialPackagePersistence.class)
    protected LFSocialPackagePersistence lfSocialPackagePersistence;
    @BeanReference(type = LFSocialPackageTagPersistence.class)
    protected LFSocialPackageTagPersistence lfSocialPackageTagPersistence;
    @BeanReference(type = LFTincanActivityPersistence.class)
    protected LFTincanActivityPersistence lfTincanActivityPersistence;
    @BeanReference(type = LFTincanActorPersistence.class)
    protected LFTincanActorPersistence lfTincanActorPersistence;
    @BeanReference(type = LFTincanLrsActivityProfilePersistence.class)
    protected LFTincanLrsActivityProfilePersistence lfTincanLrsActivityProfilePersistence;
    @BeanReference(type = LFTincanLrsAgentProfilePersistence.class)
    protected LFTincanLrsAgentProfilePersistence lfTincanLrsAgentProfilePersistence;
    @BeanReference(type = LFTincanLrsAttachmentPersistence.class)
    protected LFTincanLrsAttachmentPersistence lfTincanLrsAttachmentPersistence;
    @BeanReference(type = LFTincanLrsContextPersistence.class)
    protected LFTincanLrsContextPersistence lfTincanLrsContextPersistence;
    @BeanReference(type = LFTincanLrsContextActivitiesPersistence.class)
    protected LFTincanLrsContextActivitiesPersistence lfTincanLrsContextActivitiesPersistence;
    @BeanReference(type = LFTincanLrsDocumentPersistence.class)
    protected LFTincanLrsDocumentPersistence lfTincanLrsDocumentPersistence;
    @BeanReference(type = LFTincanLrsEndpointPersistence.class)
    protected LFTincanLrsEndpointPersistence lfTincanLrsEndpointPersistence;
    @BeanReference(type = LFTincanLrsResultPersistence.class)
    protected LFTincanLrsResultPersistence lfTincanLrsResultPersistence;
    @BeanReference(type = LFTincanLrsStatePersistence.class)
    protected LFTincanLrsStatePersistence lfTincanLrsStatePersistence;
    @BeanReference(type = LFTincanLrsStatementPersistence.class)
    protected LFTincanLrsStatementPersistence lfTincanLrsStatementPersistence;
    @BeanReference(type = LFTincanLrsStatementRefPersistence.class)
    protected LFTincanLrsStatementRefPersistence lfTincanLrsStatementRefPersistence;
    @BeanReference(type = LFTincanLrsSubStatementPersistence.class)
    protected LFTincanLrsSubStatementPersistence lfTincanLrsSubStatementPersistence;
    @BeanReference(type = LFTincanManifestActivityPersistence.class)
    protected LFTincanManifestActivityPersistence lfTincanManifestActivityPersistence;
    @BeanReference(type = LFTincanPackagePersistence.class)
    protected LFTincanPackagePersistence lfTincanPackagePersistence;
    @BeanReference(type = LFUserPersistence.class)
    protected LFUserPersistence lfUserPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the l f tincan lrs sub statement in the entity cache if it is enabled.
     *
     * @param lfTincanLrsSubStatement the l f tincan lrs sub statement
     */
    public void cacheResult(LFTincanLrsSubStatement lfTincanLrsSubStatement) {
        EntityCacheUtil.putResult(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
            LFTincanLrsSubStatementImpl.class,
            lfTincanLrsSubStatement.getPrimaryKey(), lfTincanLrsSubStatement);

        lfTincanLrsSubStatement.resetOriginalValues();
    }

    /**
     * Caches the l f tincan lrs sub statements in the entity cache if it is enabled.
     *
     * @param lfTincanLrsSubStatements the l f tincan lrs sub statements
     */
    public void cacheResult(
        List<LFTincanLrsSubStatement> lfTincanLrsSubStatements) {
        for (LFTincanLrsSubStatement lfTincanLrsSubStatement : lfTincanLrsSubStatements) {
            if (EntityCacheUtil.getResult(
                        LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
                        LFTincanLrsSubStatementImpl.class,
                        lfTincanLrsSubStatement.getPrimaryKey()) == null) {
                cacheResult(lfTincanLrsSubStatement);
            } else {
                lfTincanLrsSubStatement.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all l f tincan lrs sub statements.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LFTincanLrsSubStatementImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LFTincanLrsSubStatementImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the l f tincan lrs sub statement.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LFTincanLrsSubStatement lfTincanLrsSubStatement) {
        EntityCacheUtil.removeResult(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
            LFTincanLrsSubStatementImpl.class,
            lfTincanLrsSubStatement.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<LFTincanLrsSubStatement> lfTincanLrsSubStatements) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LFTincanLrsSubStatement lfTincanLrsSubStatement : lfTincanLrsSubStatements) {
            EntityCacheUtil.removeResult(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
                LFTincanLrsSubStatementImpl.class,
                lfTincanLrsSubStatement.getPrimaryKey());
        }
    }

    /**
     * Creates a new l f tincan lrs sub statement with the primary key. Does not add the l f tincan lrs sub statement to the database.
     *
     * @param id the primary key for the new l f tincan lrs sub statement
     * @return the new l f tincan lrs sub statement
     */
    public LFTincanLrsSubStatement create(long id) {
        LFTincanLrsSubStatement lfTincanLrsSubStatement = new LFTincanLrsSubStatementImpl();

        lfTincanLrsSubStatement.setNew(true);
        lfTincanLrsSubStatement.setPrimaryKey(id);

        return lfTincanLrsSubStatement;
    }

    /**
     * Removes the l f tincan lrs sub statement with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the l f tincan lrs sub statement
     * @return the l f tincan lrs sub statement that was removed
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsSubStatementException if a l f tincan lrs sub statement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFTincanLrsSubStatement remove(long id)
        throws NoSuchLFTincanLrsSubStatementException, SystemException {
        return remove(Long.valueOf(id));
    }

    /**
     * Removes the l f tincan lrs sub statement with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the l f tincan lrs sub statement
     * @return the l f tincan lrs sub statement that was removed
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsSubStatementException if a l f tincan lrs sub statement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFTincanLrsSubStatement remove(Serializable primaryKey)
        throws NoSuchLFTincanLrsSubStatementException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LFTincanLrsSubStatement lfTincanLrsSubStatement = (LFTincanLrsSubStatement) session.get(LFTincanLrsSubStatementImpl.class,
                    primaryKey);

            if (lfTincanLrsSubStatement == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLFTincanLrsSubStatementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(lfTincanLrsSubStatement);
        } catch (NoSuchLFTincanLrsSubStatementException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LFTincanLrsSubStatement removeImpl(
        LFTincanLrsSubStatement lfTincanLrsSubStatement)
        throws SystemException {
        lfTincanLrsSubStatement = toUnwrappedModel(lfTincanLrsSubStatement);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, lfTincanLrsSubStatement);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(lfTincanLrsSubStatement);

        return lfTincanLrsSubStatement;
    }

    @Override
    public LFTincanLrsSubStatement updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsSubStatement lfTincanLrsSubStatement,
        boolean merge) throws SystemException {
        lfTincanLrsSubStatement = toUnwrappedModel(lfTincanLrsSubStatement);

        boolean isNew = lfTincanLrsSubStatement.isNew();

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, lfTincanLrsSubStatement, merge);

            lfTincanLrsSubStatement.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
            LFTincanLrsSubStatementImpl.class,
            lfTincanLrsSubStatement.getPrimaryKey(), lfTincanLrsSubStatement);

        return lfTincanLrsSubStatement;
    }

    protected LFTincanLrsSubStatement toUnwrappedModel(
        LFTincanLrsSubStatement lfTincanLrsSubStatement) {
        if (lfTincanLrsSubStatement instanceof LFTincanLrsSubStatementImpl) {
            return lfTincanLrsSubStatement;
        }

        LFTincanLrsSubStatementImpl lfTincanLrsSubStatementImpl = new LFTincanLrsSubStatementImpl();

        lfTincanLrsSubStatementImpl.setNew(lfTincanLrsSubStatement.isNew());
        lfTincanLrsSubStatementImpl.setPrimaryKey(lfTincanLrsSubStatement.getPrimaryKey());

        lfTincanLrsSubStatementImpl.setId(lfTincanLrsSubStatement.getId());
        lfTincanLrsSubStatementImpl.setActorID(lfTincanLrsSubStatement.getActorID());
        lfTincanLrsSubStatementImpl.setVerbID(lfTincanLrsSubStatement.getVerbID());
        lfTincanLrsSubStatementImpl.setVerbDisplay(lfTincanLrsSubStatement.getVerbDisplay());
        lfTincanLrsSubStatementImpl.setObjType(lfTincanLrsSubStatement.getObjType());
        lfTincanLrsSubStatementImpl.setObjID(lfTincanLrsSubStatement.getObjID());

        return lfTincanLrsSubStatementImpl;
    }

    /**
     * Returns the l f tincan lrs sub statement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the l f tincan lrs sub statement
     * @return the l f tincan lrs sub statement
     * @throws com.liferay.portal.NoSuchModelException if a l f tincan lrs sub statement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFTincanLrsSubStatement findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the l f tincan lrs sub statement with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsSubStatementException} if it could not be found.
     *
     * @param id the primary key of the l f tincan lrs sub statement
     * @return the l f tincan lrs sub statement
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsSubStatementException if a l f tincan lrs sub statement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFTincanLrsSubStatement findByPrimaryKey(long id)
        throws NoSuchLFTincanLrsSubStatementException, SystemException {
        LFTincanLrsSubStatement lfTincanLrsSubStatement = fetchByPrimaryKey(id);

        if (lfTincanLrsSubStatement == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
            }

            throw new NoSuchLFTincanLrsSubStatementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                id);
        }

        return lfTincanLrsSubStatement;
    }

    /**
     * Returns the l f tincan lrs sub statement with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the l f tincan lrs sub statement
     * @return the l f tincan lrs sub statement, or <code>null</code> if a l f tincan lrs sub statement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFTincanLrsSubStatement fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the l f tincan lrs sub statement with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the l f tincan lrs sub statement
     * @return the l f tincan lrs sub statement, or <code>null</code> if a l f tincan lrs sub statement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFTincanLrsSubStatement fetchByPrimaryKey(long id)
        throws SystemException {
        LFTincanLrsSubStatement lfTincanLrsSubStatement = (LFTincanLrsSubStatement) EntityCacheUtil.getResult(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
                LFTincanLrsSubStatementImpl.class, id);

        if (lfTincanLrsSubStatement == _nullLFTincanLrsSubStatement) {
            return null;
        }

        if (lfTincanLrsSubStatement == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                lfTincanLrsSubStatement = (LFTincanLrsSubStatement) session.get(LFTincanLrsSubStatementImpl.class,
                        Long.valueOf(id));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (lfTincanLrsSubStatement != null) {
                    cacheResult(lfTincanLrsSubStatement);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(LFTincanLrsSubStatementModelImpl.ENTITY_CACHE_ENABLED,
                        LFTincanLrsSubStatementImpl.class, id,
                        _nullLFTincanLrsSubStatement);
                }

                closeSession(session);
            }
        }

        return lfTincanLrsSubStatement;
    }

    /**
     * Returns all the l f tincan lrs sub statements.
     *
     * @return the l f tincan lrs sub statements
     * @throws SystemException if a system exception occurred
     */
    public List<LFTincanLrsSubStatement> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the l f tincan lrs sub statements.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of l f tincan lrs sub statements
     * @param end the upper bound of the range of l f tincan lrs sub statements (not inclusive)
     * @return the range of l f tincan lrs sub statements
     * @throws SystemException if a system exception occurred
     */
    public List<LFTincanLrsSubStatement> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the l f tincan lrs sub statements.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of l f tincan lrs sub statements
     * @param end the upper bound of the range of l f tincan lrs sub statements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of l f tincan lrs sub statements
     * @throws SystemException if a system exception occurred
     */
    public List<LFTincanLrsSubStatement> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<LFTincanLrsSubStatement> list = (List<LFTincanLrsSubStatement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LFTINCANLRSSUBSTATEMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LFTINCANLRSSUBSTATEMENT;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<LFTincanLrsSubStatement>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<LFTincanLrsSubStatement>) QueryUtil.list(q,
                            getDialect(), start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the l f tincan lrs sub statements from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (LFTincanLrsSubStatement lfTincanLrsSubStatement : findAll()) {
            remove(lfTincanLrsSubStatement);
        }
    }

    /**
     * Returns the number of l f tincan lrs sub statements.
     *
     * @return the number of l f tincan lrs sub statements
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_LFTINCANLRSSUBSTATEMENT);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the l f tincan lrs sub statement persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.arcusys.learn.persistence.liferay.model.LFTincanLrsSubStatement")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LFTincanLrsSubStatement>> listenersList = new ArrayList<ModelListener<LFTincanLrsSubStatement>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LFTincanLrsSubStatement>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LFTincanLrsSubStatementImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}