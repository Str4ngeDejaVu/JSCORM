package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFLessonLimit;
import com.arcusys.learn.persistence.liferay.model.LFLessonLimitModel;
import com.arcusys.learn.persistence.liferay.service.persistence.LFLessonLimitPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LFLessonLimit service. Represents a row in the &quot;Learn_LFLessonLimit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFLessonLimitModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFLessonLimitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFLessonLimitImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFLessonLimit
 * @see com.arcusys.learn.persistence.liferay.model.LFLessonLimitModel
 * @generated
 */
public class LFLessonLimitModelImpl extends BaseModelImpl<LFLessonLimit>
    implements LFLessonLimitModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f lesson limit model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFLessonLimit} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFLessonLimit";
    public static final Object[][] TABLE_COLUMNS = {
            { "itemID", Types.BIGINT },
            { "itemType", Types.VARCHAR },
            { "passingLimit", Types.INTEGER },
            { "rerunInterval", Types.INTEGER },
            { "rerunIntervalType", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFLessonLimit (itemID LONG not null,itemType VARCHAR(75) not null,passingLimit INTEGER null,rerunInterval INTEGER null,rerunIntervalType VARCHAR(75) null,primary key (itemID, itemType))";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFLessonLimit";
    public static final String ORDER_BY_JPQL = " ORDER BY lfLessonLimit.id.itemID ASC, lfLessonLimit.id.itemType ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFLessonLimit.itemID ASC, Learn_LFLessonLimit.itemType ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFLessonLimit"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFLessonLimit"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFLessonLimit"),
            true);
    public static long ITEMID_COLUMN_BITMASK = 1L;
    public static long ITEMTYPE_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFLessonLimit"));
    private static ClassLoader _classLoader = LFLessonLimit.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFLessonLimit.class
        };
    private Long _itemID;
    private Long _originalItemID;
    private boolean _setOriginalItemID;
    private String _itemType;
    private String _originalItemType;
    private Integer _passingLimit;
    private Integer _rerunInterval;
    private String _rerunIntervalType;
    private long _columnBitmask;
    private LFLessonLimit _escapedModel;

    public LFLessonLimitModelImpl() {
    }

    @Override
    public LFLessonLimitPK getPrimaryKey() {
        return new LFLessonLimitPK(_itemID, _itemType);
    }

    @Override
    public void setPrimaryKey(LFLessonLimitPK primaryKey) {
        setItemID(primaryKey.itemID);
        setItemType(primaryKey.itemType);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new LFLessonLimitPK(_itemID, _itemType);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((LFLessonLimitPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return LFLessonLimit.class;
    }

    @Override
    public String getModelClassName() {
        return LFLessonLimit.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("itemID", getItemID());
        attributes.put("itemType", getItemType());
        attributes.put("passingLimit", getPassingLimit());
        attributes.put("rerunInterval", getRerunInterval());
        attributes.put("rerunIntervalType", getRerunIntervalType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long itemID = (Long) attributes.get("itemID");

        if (itemID != null) {
            setItemID(itemID);
        }

        String itemType = (String) attributes.get("itemType");

        if (itemType != null) {
            setItemType(itemType);
        }

        Integer passingLimit = (Integer) attributes.get("passingLimit");

        if (passingLimit != null) {
            setPassingLimit(passingLimit);
        }

        Integer rerunInterval = (Integer) attributes.get("rerunInterval");

        if (rerunInterval != null) {
            setRerunInterval(rerunInterval);
        }

        String rerunIntervalType = (String) attributes.get("rerunIntervalType");

        if (rerunIntervalType != null) {
            setRerunIntervalType(rerunIntervalType);
        }
    }

    @Override
    public Long getItemID() {
        return _itemID;
    }

    @Override
    public void setItemID(Long itemID) {
        _columnBitmask |= ITEMID_COLUMN_BITMASK;

        if (!_setOriginalItemID) {
            _setOriginalItemID = true;

            _originalItemID = _itemID;
        }

        _itemID = itemID;
    }

    public Long getOriginalItemID() {
        return _originalItemID;
    }

    @Override
    public String getItemType() {
        return _itemType;
    }

    @Override
    public void setItemType(String itemType) {
        _columnBitmask |= ITEMTYPE_COLUMN_BITMASK;

        if (_originalItemType == null) {
            _originalItemType = _itemType;
        }

        _itemType = itemType;
    }

    public String getOriginalItemType() {
        return _originalItemType;
    }

    @Override
    public Integer getPassingLimit() {
        return _passingLimit;
    }

    @Override
    public void setPassingLimit(Integer passingLimit) {
        _passingLimit = passingLimit;
    }

    @Override
    public Integer getRerunInterval() {
        return _rerunInterval;
    }

    @Override
    public void setRerunInterval(Integer rerunInterval) {
        _rerunInterval = rerunInterval;
    }

    @Override
    public String getRerunIntervalType() {
        return _rerunIntervalType;
    }

    @Override
    public void setRerunIntervalType(String rerunIntervalType) {
        _rerunIntervalType = rerunIntervalType;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public LFLessonLimit toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFLessonLimit) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFLessonLimitImpl lfLessonLimitImpl = new LFLessonLimitImpl();

        lfLessonLimitImpl.setItemID(getItemID());
        lfLessonLimitImpl.setItemType(getItemType());
        lfLessonLimitImpl.setPassingLimit(getPassingLimit());
        lfLessonLimitImpl.setRerunInterval(getRerunInterval());
        lfLessonLimitImpl.setRerunIntervalType(getRerunIntervalType());

        lfLessonLimitImpl.resetOriginalValues();

        return lfLessonLimitImpl;
    }

    @Override
    public int compareTo(LFLessonLimit lfLessonLimit) {
        LFLessonLimitPK primaryKey = lfLessonLimit.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFLessonLimit)) {
            return false;
        }

        LFLessonLimit lfLessonLimit = (LFLessonLimit) obj;

        LFLessonLimitPK primaryKey = lfLessonLimit.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
        LFLessonLimitModelImpl lfLessonLimitModelImpl = this;

        lfLessonLimitModelImpl._originalItemID = lfLessonLimitModelImpl._itemID;

        lfLessonLimitModelImpl._setOriginalItemID = false;

        lfLessonLimitModelImpl._originalItemType = lfLessonLimitModelImpl._itemType;

        lfLessonLimitModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFLessonLimit> toCacheModel() {
        LFLessonLimitCacheModel lfLessonLimitCacheModel = new LFLessonLimitCacheModel();

        lfLessonLimitCacheModel.itemID = getItemID();

        lfLessonLimitCacheModel.itemType = getItemType();

        String itemType = lfLessonLimitCacheModel.itemType;

        if ((itemType != null) && (itemType.length() == 0)) {
            lfLessonLimitCacheModel.itemType = null;
        }

        lfLessonLimitCacheModel.passingLimit = getPassingLimit();

        lfLessonLimitCacheModel.rerunInterval = getRerunInterval();

        lfLessonLimitCacheModel.rerunIntervalType = getRerunIntervalType();

        String rerunIntervalType = lfLessonLimitCacheModel.rerunIntervalType;

        if ((rerunIntervalType != null) && (rerunIntervalType.length() == 0)) {
            lfLessonLimitCacheModel.rerunIntervalType = null;
        }

        return lfLessonLimitCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{itemID=");
        sb.append(getItemID());
        sb.append(", itemType=");
        sb.append(getItemType());
        sb.append(", passingLimit=");
        sb.append(getPassingLimit());
        sb.append(", rerunInterval=");
        sb.append(getRerunInterval());
        sb.append(", rerunIntervalType=");
        sb.append(getRerunIntervalType());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFLessonLimit");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>itemID</column-name><column-value><![CDATA[");
        sb.append(getItemID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>itemType</column-name><column-value><![CDATA[");
        sb.append(getItemType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>passingLimit</column-name><column-value><![CDATA[");
        sb.append(getPassingLimit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rerunInterval</column-name><column-value><![CDATA[");
        sb.append(getRerunInterval());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rerunIntervalType</column-name><column-value><![CDATA[");
        sb.append(getRerunIntervalType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
