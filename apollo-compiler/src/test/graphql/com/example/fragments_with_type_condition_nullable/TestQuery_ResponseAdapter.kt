// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragments_with_type_condition_nullable

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.example.fragments_with_type_condition_nullable.fragment.DroidDetails_ResponseAdapter
import com.example.fragments_with_type_condition_nullable.fragment.HumanDetails_ResponseAdapter
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forObject("r2", "hero", null, true, null),
    ResponseField.forObject("luke", "hero", null, true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var r2: TestQuery.R2? = null
      var luke: TestQuery.Luke? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> r2 = readObject<TestQuery.R2>(RESPONSE_FIELDS[0]) { reader ->
            TestQuery_ResponseAdapter.R2_ResponseAdapter.fromResponse(reader)
          }
          1 -> luke = readObject<TestQuery.Luke>(RESPONSE_FIELDS[1]) { reader ->
            TestQuery_ResponseAdapter.Luke_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        r2 = r2,
        luke = luke
      )
    }
  }

  object HumanDetailsImpl_ResponseAdapter : ResponseAdapter<TestQuery.HumanDetailsImpl> {
    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.HumanDetailsImpl {
      return TestQuery.HumanDetailsImpl(HumanDetails_ResponseAdapter.fromResponse(reader, __typename))
    }
  }

  object DroidDetailsImpl_ResponseAdapter : ResponseAdapter<TestQuery.DroidDetailsImpl> {
    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.DroidDetailsImpl {
      return TestQuery.DroidDetailsImpl(DroidDetails_ResponseAdapter.fromResponse(reader, __typename))
    }
  }

  object OtherR2_ResponseAdapter : ResponseAdapter<TestQuery.OtherR2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.OtherR2 {
      return reader.run {
        var __typename: String? = __typename
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            else -> break
          }
        }
        TestQuery.OtherR2(
          __typename = __typename!!
        )
      }
    }
  }

  object R2_ResponseAdapter : ResponseAdapter<TestQuery.R2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.R2 {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> TestQuery_ResponseAdapter.HumanDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
        "Droid" -> TestQuery_ResponseAdapter.DroidDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
        else -> TestQuery_ResponseAdapter.OtherR2_ResponseAdapter.fromResponse(reader, typename)
      }
    }
  }

  object HumanDetailsImpl1_ResponseAdapter : ResponseAdapter<TestQuery.HumanDetailsImpl1> {
    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.HumanDetailsImpl1 {
      return TestQuery.HumanDetailsImpl1(HumanDetails_ResponseAdapter.fromResponse(reader, __typename))
    }
  }

  object DroidDetailsImpl1_ResponseAdapter : ResponseAdapter<TestQuery.DroidDetailsImpl1> {
    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.DroidDetailsImpl1 {
      return TestQuery.DroidDetailsImpl1(DroidDetails_ResponseAdapter.fromResponse(reader, __typename))
    }
  }

  object OtherLuke_ResponseAdapter : ResponseAdapter<TestQuery.OtherLuke> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.OtherLuke {
      return reader.run {
        var __typename: String? = __typename
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            else -> break
          }
        }
        TestQuery.OtherLuke(
          __typename = __typename!!
        )
      }
    }
  }

  object Luke_ResponseAdapter : ResponseAdapter<TestQuery.Luke> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Luke {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> TestQuery_ResponseAdapter.HumanDetailsImpl1_ResponseAdapter.fromResponse(reader, typename)
        "Droid" -> TestQuery_ResponseAdapter.DroidDetailsImpl1_ResponseAdapter.fromResponse(reader, typename)
        else -> TestQuery_ResponseAdapter.OtherLuke_ResponseAdapter.fromResponse(reader, typename)
      }
    }
  }
}
