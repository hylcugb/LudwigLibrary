/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cirdles.ludwig.isoplot3;

import static org.cirdles.ludwig.squid25.SquidConstants.SQUID_EPSILON;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bowring
 */
public class MeansTest {

    /**
     *
     */
    public MeansTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of weightedAverage method, of class Means.
     */
    @Test
    public void testWeightedAverage() {
        System.out.println("weightedAverage using Ma data and uncertainties - oracle is Ludwig's Isoplot3.Means.WeightedAverage");
        double[] values = new double[]{
            422.429481678253000,
            445.673004549890000,
            395.105564398245000,
            462.735195934239000,
            424.348437438747000,
            438.562012822161000,
            321.342581478880000,
            641.620699188942000,
            338.497170392008000,
            418.963816709918000,
            279.948361234572000,
            478.621649698142000,
            438.873773839037000,
            448.524445440179000,
            457.124787696760000,
            427.661504983727000,
            447.746216854234000,
            452.439908000677000,
            345.150478715612000,
            392.919246783614000,
            409.785559971735000,
            486.714775252251000,
            441.117853817133000

        };
        double[] errors = new double[]{
            43.809508176617000,
            30.272846598902800,
            57.018611692881700,
            38.073695378441000,
            39.359880328441900,
            45.398691532122000,
            50.895625766862800,
            63.112407173255800,
            70.996046586758100,
            56.368690915476400,
            95.711499355788400,
            47.052509854362600,
            41.811434926229700,
            69.081419146139200,
            33.840546325141300,
            44.523690999237800,
            36.484120802534300,
            47.762864733551300,
            54.239452697957400,
            30.475598210695400,
            54.371062520740100,
            56.614505311394500,
            83.429587216997200
        };

        double[] expResult = new double[]{431.72278878305707, 9.52995899409635,
            11.148926709700243, 22.600383557789442, 1.3076310129910607, 0.15160797601388276};
        double[] result = Means.weightedAverage(values, errors, false, false)[0];
        assertArrayEquals(expResult, result, SQUID_EPSILON);

        System.out.println("weightedAverage 238");
        values = new double[]{
            // 0.00884012768001511,
            0.00884482434708822,
            0.00894942461822356,
            0.00889112670953696,
            0.00890349557746501,
            0.00883138331975604,
            0.00876125771950047,
            //0.00892612565709379,
            //0.00889761850769793,
            0.00892993550196493,
            0.00890203514590812,
            //0.00905772917568000,
            //0.00887281165404440,
            0.00869497835253045,
            0.00878625290110216,
            0.00898639388860170,
            0.00891147007556454,
            0.00895363451243574,
            0.00883845165839725,
            0.00890646409897058,
            0.00879306700888207

        };
        // these are 1-sigma percent errors
        errors = new double[]{
            //0.580084916224033,
            0.318530700755801,
            0.304784915850586,
            0.499614559386961,
            0.307217150220516,
            0.314323819438596,
            0.307491828713402,
            //0.562739415363749,
            //0.578265872862096,
            0.349453015920481,
            0.313567592682458,
            //0.564822124409578,
            //0.855773017427626,
            0.319535292145000,
            0.317747355283710,
            0.313471282662508,
            0.381403634488646,
            0.315330262602451,
            0.328677825685174,
            0.319268071644238,
            0.335187788342414};

        expResult = new double[]{0.008878829024487339, 5.8914250295570144E-5, 1.687608175425885E-5, 3.491041642807011E-5, 5.658307625943268, 3.953271043855011E-11};

        double[] absUnct = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            absUnct[i] = (errors[i] * values[i]) / 100.0;
        }
        result = Means.weightedAverage(values, absUnct, true, false)[0];
        assertArrayEquals(expResult, result, SQUID_EPSILON);

        System.out.println("weightedAverage 232");
        values = new double[]{
            0.01310443459586880,
            0.01300452064976640,
            0.01352860494862120,
            0.01301531970411360,
            0.01285100638335880,
            0.01347338858588280,
            0.01343164578070520,
            0.01308293822127230,
            0.01362531507918070,
            //            0.01304085867524090,
            0.01404830333363570,
            0.01295820370447700,
            0.01316144577935790,
            0.01241758079800060,
            0.01282181328196980,
            0.01331134530611480,
            0.01279019912756860,
            0.01331154946774380,
            0.01232676348563910,
            0.01279370544881440,
            0.01280812800300990

        };
        // these are 1-sigma percent errors
        errors = new double[]{
            4.73263422379419000,
            2.96878747344440000,
            2.70249557630484000,
            3.07262276766305000,
            2.89028815997547000,
            2.90631023565814000,
            2.86412556074729000,
            2.98178690055848000,
            4.94424224421275000,
            //            5.51694791918178000,
            2.72408323321023000,
            3.52277366334225000,
            2.95144043643686000,
            3.02208944342706000,
            3.00874735410379000,
            2.84434802879348000,
            3.17407594622043000,
            2.98427002833909000,
            3.06609999337721000,
            3.04908894148808000,
            3.22906820874518000
        };

        expResult = new double[]{0.01307771811564064, 9.008745163259912E-5,
            9.006943414227261E-5, 1.7657140519989427E-4, 1.0893416768705497, 0.35375414119317605};

        absUnct = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            absUnct[i] = (errors[i] * values[i]) / 100.0;
        }

        result = Means.weightedAverage(values, absUnct, true, false)[0];
        assertArrayEquals(expResult, result, SQUID_EPSILON);

    }
}
