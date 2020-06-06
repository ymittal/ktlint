package com.pinterest.ktlint.ruleset.experimental

import com.pinterest.ktlint.test.diffFileFormat
import com.pinterest.ktlint.test.diffFileLint
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SpacingAroundAngleBracketRuleTest {

    @Test
    fun testLint() {
        assertThat(SpacingAroundAngleBracketsRule().diffFileLint("spec/spacing-around-angle-brackets/lint.kt.spec")).isEmpty()
    }

    @Test
    fun testFormat() {
        assertThat(
            SpacingAroundAngleBracketsRule().diffFileFormat(
                "spec/spacing-around-angle-brackets/format.kt.spec",
                "spec/spacing-around-angle-brackets/format-expected.kt.spec"
            )
        ).isEmpty()
    }
}
