package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFPackageScopeRuleLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LFPackageScopeRuleLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName316;
    private String[] _methodParameterTypes316;
    private String _methodName317;
    private String[] _methodParameterTypes317;
    private String _methodName322;
    private String[] _methodParameterTypes322;
    private String _methodName323;
    private String[] _methodParameterTypes323;
    private String _methodName324;
    private String[] _methodParameterTypes324;
    private String _methodName325;
    private String[] _methodParameterTypes325;
    private String _methodName326;
    private String[] _methodParameterTypes326;
    private String _methodName327;
    private String[] _methodParameterTypes327;
    private String _methodName328;
    private String[] _methodParameterTypes328;
    private String _methodName329;
    private String[] _methodParameterTypes329;
    private String _methodName330;
    private String[] _methodParameterTypes330;
    private String _methodName331;
    private String[] _methodParameterTypes331;
    private String _methodName332;
    private String[] _methodParameterTypes332;

    public LFPackageScopeRuleLocalServiceClpInvoker() {
        _methodName0 = "addLFPackageScopeRule";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule"
            };

        _methodName1 = "createLFPackageScopeRule";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFPackageScopeRule";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFPackageScopeRule";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchLFPackageScopeRule";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getLFPackageScopeRule";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getLFPackageScopeRules";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getLFPackageScopeRulesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateLFPackageScopeRule";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule"
            };

        _methodName316 = "getBeanIdentifier";

        _methodParameterTypes316 = new String[] {  };

        _methodName317 = "setBeanIdentifier";

        _methodParameterTypes317 = new String[] { "java.lang.String" };

        _methodName322 = "createLFPackageScopeRule";

        _methodParameterTypes322 = new String[] {  };

        _methodName323 = "findByPackageID";

        _methodParameterTypes323 = new String[] { "java.lang.Integer" };

        _methodName324 = "findByScopeAndIsDefault";

        _methodParameterTypes324 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.Boolean"
            };

        _methodName325 = "findByScope";

        _methodParameterTypes325 = new String[] {
                "java.lang.String", "java.lang.String"
            };

        _methodName326 = "findByPackageIDAndScope";

        _methodParameterTypes326 = new String[] {
                "java.lang.Integer", "java.lang.String", "java.lang.String"
            };

        _methodName327 = "fetchByPackageIDAndScope";

        _methodParameterTypes327 = new String[] {
                "java.lang.Integer", "java.lang.String", "java.lang.String"
            };

        _methodName328 = "findByAllByPackageIDAndScope";

        _methodParameterTypes328 = new String[] {
                "java.lang.Integer", "java.lang.String", "java.lang.String"
            };

        _methodName329 = "findByVisibility";

        _methodParameterTypes329 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.Boolean"
            };

        _methodName330 = "removeByPackageID";

        _methodParameterTypes330 = new String[] { "java.lang.Integer" };

        _methodName331 = "removeAll";

        _methodParameterTypes331 = new String[] {  };

        _methodName332 = "getLFPackageScopeRule";

        _methodParameterTypes332 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.addLFPackageScopeRule((com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.createLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.deleteLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.deleteLFPackageScopeRule((com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.fetchLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRules(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRulesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.updateLFPackageScopeRule((com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule) arguments[0]);
        }

        if (_methodName316.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes316, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName317.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes317, parameterTypes)) {
            LFPackageScopeRuleLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName322.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes322, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.createLFPackageScopeRule();
        }

        if (_methodName323.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes323, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByPackageID((java.lang.Integer) arguments[0]);
        }

        if (_methodName324.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes324, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByScopeAndIsDefault((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.Boolean) arguments[2]);
        }

        if (_methodName325.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes325, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByScope((java.lang.String) arguments[0],
                (java.lang.String) arguments[1]);
        }

        if (_methodName326.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes326, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByPackageIDAndScope((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName327.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes327, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.fetchByPackageIDAndScope((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName328.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes328, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByAllByPackageIDAndScope((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName329.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes329, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByVisibility((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.Boolean) arguments[2]);
        }

        if (_methodName330.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes330, parameterTypes)) {
            LFPackageScopeRuleLocalServiceUtil.removeByPackageID((java.lang.Integer) arguments[0]);

            return null;
        }

        if (_methodName331.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes331, parameterTypes)) {
            LFPackageScopeRuleLocalServiceUtil.removeAll();

            return null;
        }

        if (_methodName332.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes332, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
