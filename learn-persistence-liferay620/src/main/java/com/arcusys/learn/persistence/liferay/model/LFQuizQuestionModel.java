package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFQuizQuestion service. Represents a row in the &quot;Learn_LFQuizQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFQuizQuestion
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionModelImpl
 * @generated
 */
public interface LFQuizQuestionModel extends BaseModel<LFQuizQuestion> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f quiz question model instance should use the {@link LFQuizQuestion} interface instead.
     */

    /**
     * Returns the primary key of this l f quiz question.
     *
     * @return the primary key of this l f quiz question
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l f quiz question.
     *
     * @param primaryKey the primary key of this l f quiz question
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this l f quiz question.
     *
     * @return the ID of this l f quiz question
     */
    public long getId();

    /**
     * Sets the ID of this l f quiz question.
     *
     * @param id the ID of this l f quiz question
     */
    public void setId(long id);

    /**
     * Returns the quiz ID of this l f quiz question.
     *
     * @return the quiz ID of this l f quiz question
     */
    public Integer getQuizId();

    /**
     * Sets the quiz ID of this l f quiz question.
     *
     * @param quizId the quiz ID of this l f quiz question
     */
    public void setQuizId(Integer quizId);

    /**
     * Returns the category ID of this l f quiz question.
     *
     * @return the category ID of this l f quiz question
     */
    public Integer getCategoryId();

    /**
     * Sets the category ID of this l f quiz question.
     *
     * @param categoryId the category ID of this l f quiz question
     */
    public void setCategoryId(Integer categoryId);

    /**
     * Returns the question ID of this l f quiz question.
     *
     * @return the question ID of this l f quiz question
     */
    public Integer getQuestionId();

    /**
     * Sets the question ID of this l f quiz question.
     *
     * @param questionId the question ID of this l f quiz question
     */
    public void setQuestionId(Integer questionId);

    /**
     * Returns the question type of this l f quiz question.
     *
     * @return the question type of this l f quiz question
     */
    @AutoEscape
    public String getQuestionType();

    /**
     * Sets the question type of this l f quiz question.
     *
     * @param questionType the question type of this l f quiz question
     */
    public void setQuestionType(String questionType);

    /**
     * Returns the title of this l f quiz question.
     *
     * @return the title of this l f quiz question
     */
    @AutoEscape
    public String getTitle();

    /**
     * Sets the title of this l f quiz question.
     *
     * @param title the title of this l f quiz question
     */
    public void setTitle(String title);

    /**
     * Returns the url of this l f quiz question.
     *
     * @return the url of this l f quiz question
     */
    @AutoEscape
    public String getUrl();

    /**
     * Sets the url of this l f quiz question.
     *
     * @param url the url of this l f quiz question
     */
    public void setUrl(String url);

    /**
     * Returns the plain text of this l f quiz question.
     *
     * @return the plain text of this l f quiz question
     */
    @AutoEscape
    public String getPlainText();

    /**
     * Sets the plain text of this l f quiz question.
     *
     * @param plainText the plain text of this l f quiz question
     */
    public void setPlainText(String plainText);

    /**
     * Returns the arrangement index of this l f quiz question.
     *
     * @return the arrangement index of this l f quiz question
     */
    public Integer getArrangementIndex();

    /**
     * Sets the arrangement index of this l f quiz question.
     *
     * @param arrangementIndex the arrangement index of this l f quiz question
     */
    public void setArrangementIndex(Integer arrangementIndex);

    /**
     * Returns the auto show answer of this l f quiz question.
     *
     * @return the auto show answer of this l f quiz question
     */
    public Boolean getAutoShowAnswer();

    /**
     * Sets the auto show answer of this l f quiz question.
     *
     * @param autoShowAnswer the auto show answer of this l f quiz question
     */
    public void setAutoShowAnswer(Boolean autoShowAnswer);

    /**
     * Returns the group ID of this l f quiz question.
     *
     * @return the group ID of this l f quiz question
     */
    public Integer getGroupId();

    /**
     * Sets the group ID of this l f quiz question.
     *
     * @param groupId the group ID of this l f quiz question
     */
    public void setGroupId(Integer groupId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(LFQuizQuestion lfQuizQuestion);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFQuizQuestion> toCacheModel();

    @Override
    public LFQuizQuestion toEscapedModel();

    @Override
    public LFQuizQuestion toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
