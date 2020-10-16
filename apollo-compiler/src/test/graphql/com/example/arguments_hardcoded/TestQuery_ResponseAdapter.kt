// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.arguments_hardcoded

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forList("reviews", "reviews", mapOf<String, Any>(
      "episode" to "JEDI",
      "starsInt" to 10,
      "starsFloat" to 9.9), true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var reviews: List<TestQuery.Review?>? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> reviews = readList<TestQuery.Review>(RESPONSE_FIELDS[0]) { reader ->
            reader.readObject<TestQuery.Review> { reader ->
              TestQuery_ResponseAdapter.Review_ResponseAdapter.fromResponse(reader)
            }
          }
          else -> break
        }
      }
      TestQuery.Data(
        reviews = reviews
      )
    }
  }

  object Review_ResponseAdapter : ResponseAdapter<TestQuery.Review> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forInt("stars", "stars", null, false, null),
      ResponseField.forString("commentary", "commentary", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Review {
      return reader.run {
        var __typename: String? = __typename
        var stars: Int? = null
        var commentary: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> stars = readInt(RESPONSE_FIELDS[1])
            2 -> commentary = readString(RESPONSE_FIELDS[2])
            else -> break
          }
        }
        TestQuery.Review(
          __typename = __typename!!,
          stars = stars!!,
          commentary = commentary
        )
      }
    }
  }
}
