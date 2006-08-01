package org.testng.internal.annotations;


/**
 * An implementation of IConfiguration
 * 
 * Created on Dec 16, 2005
 * @author cbeust
 */
public class ConfigurationAnnotation extends TestOrConfiguration implements IConfiguration {
  private boolean m_beforeTestClass = false;
  private boolean m_afterTestClass = false;
  private boolean m_beforeTestMethod = false;
  private boolean m_afterTestMethod = false;
  private boolean m_beforeTest = false;
  private boolean m_afterTest = false;
  private boolean m_beforeSuite = false;
  private boolean m_afterSuite = false;
  private String[] m_parameters = {};
  private boolean m_alwaysRun = false;
  private boolean m_inheritGroups = true;
  private String[] m_beforeGroups = {};
  private String[] m_afterGroups = {};
  private boolean m_isFakeConfiguration;

  public ConfigurationAnnotation() {
    
  }
  
  public void setAfterSuite(boolean afterSuite) {
    m_afterSuite = afterSuite;
  }

  public void setAfterTest(boolean afterTest) {
    m_afterTest = afterTest;
  }

  public void setAfterTestClass(boolean afterTestClass) {
    m_afterTestClass = afterTestClass;
  }

  public void setAfterTestMethod(boolean afterTestMethod) {
    m_afterTestMethod = afterTestMethod;
  }

  public void setAlwaysRun(boolean alwaysRun) {
    m_alwaysRun = alwaysRun;
  }

  public void setBeforeSuite(boolean beforeSuite) {
    m_beforeSuite = beforeSuite;
  }

  public void setBeforeTest(boolean beforeTest) {
    m_beforeTest = beforeTest;
  }

  public void setBeforeTestClass(boolean beforeTestClass) {
    m_beforeTestClass = beforeTestClass;
  }

  public void setBeforeTestMethod(boolean beforeTestMethod) {
    m_beforeTestMethod = beforeTestMethod;
  }

  public void setInheritGroups(boolean inheritGroups) {
    m_inheritGroups = inheritGroups;
  }

  @Override
  public void setParameters(String[] parameters) {
    m_parameters = parameters;
  }

  public boolean getBeforeTestClass() {
    return m_beforeTestClass;
  }

  public boolean getAfterTestClass() {
    return m_afterTestClass;
  }

  public boolean getBeforeTestMethod() {
    return m_beforeTestMethod;
  }

  public boolean getAfterTestMethod() {
    return m_afterTestMethod;
  }

  public boolean getBeforeSuite() {
    return m_beforeSuite;
  }

  public boolean getAfterSuite() {
    return m_afterSuite;
  }

  public boolean getBeforeTest() {
    return m_beforeTest;
  }

  public boolean getAfterTest() {
    return m_afterTest;
  }

  @Override
  public String[] getParameters() {
    return m_parameters;
  }

  public boolean getAlwaysRun() {
    return m_alwaysRun;
  }

  public boolean getInheritGroups() {
    return m_inheritGroups;
  }

  public String[] getAfterGroups() {
    return m_afterGroups;
  }

  public void setAfterGroups(String[] afterGroups) {
    m_afterGroups = afterGroups;
  }

  public String[] getBeforeGroups() {
    return m_beforeGroups;
  }

  public void setBeforeGroups(String[] beforeGroups) {
    m_beforeGroups = beforeGroups;
  }

  public void setFakeConfiguration(boolean b) {
    m_isFakeConfiguration = b;
  }

  public boolean isFakeConfiguration() {
    return m_isFakeConfiguration;
  }
}