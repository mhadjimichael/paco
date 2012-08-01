// Copyright 2012 Google Inc. All Rights Reserved.

package com.google.sampling.experiential.shared;

import static org.junit.Assert.*;

import com.google.common.collect.Lists;

import org.junit.Test;

/**
 * @author corycornelius@google.com (Cory Cornelius)
 *
 */
public class ExperimentTest {
  @Test
  public void testEquality() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenTitleSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setTitle("title");
    experiment2.setTitle("title");

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenDescriptionSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setDescription("description");
    experiment2.setDescription("description");

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenCreatorSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setCreator("creator");
    experiment2.setCreator("creator");

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenConsentFormSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setConsentForm("consent form");
    experiment2.setConsentForm("consent form");

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenVersionSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setVersion(3);
    experiment2.setVersion(3);

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenPublishedSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setPublished(true);
    experiment2.setPublished(true);

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenDeletedSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setDeleted(true);
    experiment2.setDeleted(true);

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenObserversSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setObservers(Lists.newArrayList("observer"));
    experiment2.setObservers(Lists.newArrayList("observer"));

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenSubjectsSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSubjects(Lists.newArrayList("subject"));
    experiment2.setSubjects(Lists.newArrayList("subject"));

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenInputsSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setInputs(Lists.newArrayList(new TextInput(), new ListInput()));
    experiment2.setInputs(Lists.newArrayList(new TextInput(), new ListInput()));

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenFeedbacksSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setFeedbacks(Lists.newArrayList(new Feedback()));
    experiment2.setFeedbacks(Lists.newArrayList(new Feedback()));

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenTitleSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setTitle("title1");
    experiment2.setTitle("title2");

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenDescriptionSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setDescription("description1");
    experiment2.setDescription("description2");

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenCreatorSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setCreator("creator1");
    experiment2.setCreator("creator2");

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenConsentFormSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setConsentForm("consent form1");
    experiment2.setConsentForm("consent form2");

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenVersionSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setVersion(3);
    experiment2.setVersion(4);

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenPublishedSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setPublished(true);
    experiment2.setPublished(false);

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenDeletedSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setDeleted(true);
    experiment2.setDeleted(false);

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenObserversSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setObservers(Lists.newArrayList("observer1"));
    experiment2.setObservers(Lists.newArrayList("observer2"));

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenSubjectsSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSubjects(Lists.newArrayList("subject1"));
    experiment2.setSubjects(Lists.newArrayList("subject2"));

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenInputsSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setInputs(Lists.newArrayList(new TextInput(), new ListInput()));
    experiment2.setInputs(Lists.newArrayList(new TextInput(), new LikertInput()));

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenFeedbacksSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setFeedbacks(Lists.newArrayList(Feedback.create("feedback1")));
    experiment2.setFeedbacks(Lists.newArrayList(Feedback.create("feedback2")));

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenFeedbacksSetNull() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setFeedbacks(null);
    experiment2.setFeedbacks(Lists.newArrayList(Feedback.create("feedback2")));

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testTitleIsNotNullable() {
    Experiment experiment = new Experiment();

    experiment.setTitle(null);

    assertNotNull(experiment.getTitle());
  }

  @Test
  public void testDescriptionIsNotNullable() {
    Experiment experiment = new Experiment();

    experiment.setDescription(null);

    assertNotNull(experiment.getDescription());
  }

  @Test
  public void testCreatorIsNotNullable() {
    Experiment experiment = new Experiment();

    experiment.setCreator(null);

    assertNotNull(experiment.getCreator());
  }

  @Test
  public void testConsentFormIsNotNullable() {
    Experiment experiment = new Experiment();

    experiment.setConsentForm(null);

    assertNotNull(experiment.getConsentForm());
  }

  @Test
  public void testObserversIsNotNullable() {
    Experiment experiment = new Experiment();

    experiment.setObservers(null);

    assertNotNull(experiment.getObservers());
  }

  @Test
  public void testSubjectsIsNotNullable() {
    Experiment experiment = new Experiment();

    experiment.setSubjects(null);

    assertNotNull(experiment.getSubjects());
  }

  @Test
  public void testInputsIsNotNullable() {
    Experiment experiment = new Experiment();

    experiment.setInputs(null);

    assertNotNull(experiment.getInputs());
  }

  @Test
  public void testEqualityWhenSignalScheduleSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSignalSchedule(new FixedSignal(), new DailySchedule());
    experiment2.setSignalSchedule(new FixedSignal(), new DailySchedule());

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenSignalScheduleSetNull() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSignalSchedule(null, null);
    experiment2.setSignalSchedule(null, null);

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenSignalScheduleSetNull2() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSignalSchedule(new FixedSignal(), null);
    experiment2.setSignalSchedule(new FixedSignal(), null);

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testEqualityWhenSignalScheduleSetNull3() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSignalSchedule(null, new DailySchedule());
    experiment2.setSignalSchedule(null, new DailySchedule());

    assertTrue(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenSignalScheduleSet() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSignalSchedule(new FixedSignal(), new DailySchedule());
    experiment2.setSignalSchedule(new FixedSignal(), new WeeklySchedule());

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenSignalScheduleSet2() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSignalSchedule(new FixedSignal(), new DailySchedule());
    experiment2.setSignalSchedule(new RandomSignal(), new DailySchedule());

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testInequalityWhenSignalScheduleSet3() {
    Experiment experiment1 = new Experiment();
    Experiment experiment2 = new Experiment();

    experiment1.setSignalSchedule(new FixedSignal(), new DailySchedule());
    experiment2.setSignalSchedule(new RandomSignal(), new WeeklySchedule());

    assertFalse(experiment1.equals(experiment2));
  }

  @Test
  public void testSignalScheduleIsNullable() {
    Experiment experiment = new Experiment();

    experiment.setSignalSchedule(null, null);

    assertNull(experiment.getSchedule());
    assertNull(experiment.getSignal());
  }

  @Test
  public void testSignalScheduleIsNullable2() {
    Experiment experiment = new Experiment();

    experiment.setSignalSchedule(new FixedSignal(), null);

    assertNull(experiment.getSchedule());
    assertNull(experiment.getSignal());
  }

  @Test
  public void testSignalScheduleIsNullable3() {
    Experiment experiment = new Experiment();

    experiment.setSignalSchedule(null, new DailySchedule());

    assertNull(experiment.getSchedule());
    assertNull(experiment.getSignal());
  }

  @Test
  public void testHasSignalSchedule() {
    Experiment experiment = new Experiment();

    experiment.setSignalSchedule(new FixedSignal(), new DailySchedule());

    assertTrue(experiment.hasSignalSchedule());
  }

  @Test
  public void testHasSignalScheduleWhenNull() {
    Experiment experiment = new Experiment();

    experiment.setSignalSchedule(null, null);

    assertFalse(experiment.hasSignalSchedule());
  }

  @Test
  public void testHasSignalScheduleWhenNull2() {
    Experiment experiment = new Experiment();

    experiment.setSignalSchedule(new FixedSignal(), null);

    assertFalse(experiment.hasSignalSchedule());
  }

  @Test
  public void testHasSignalScheduleWhenNull3() {
    Experiment experiment = new Experiment();

    experiment.setSignalSchedule(null, new DailySchedule());

    assertFalse(experiment.hasSignalSchedule());
  }
}
