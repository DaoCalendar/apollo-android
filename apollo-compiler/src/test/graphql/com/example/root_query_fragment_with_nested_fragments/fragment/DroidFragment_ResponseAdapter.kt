// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.root_query_fragment_with_nested_fragments.fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object DroidFragment_ResponseAdapter : ResponseAdapter<DroidFragment> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forString("__typename", "__typename", null, false, null),
    ResponseField.forString("name", "name", null, false, null),
    ResponseField.forString("primaryFunction", "primaryFunction", null, true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): DroidFragment {
    return DefaultImpl_ResponseAdapter.fromResponse(reader, __typename)
  }

  object DefaultImpl_ResponseAdapter : ResponseAdapter<DroidFragment.DefaultImpl> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forString("primaryFunction", "primaryFunction", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        DroidFragment.DefaultImpl {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var primaryFunction: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> primaryFunction = readString(RESPONSE_FIELDS[2])
            else -> break
          }
        }
        DroidFragment.DefaultImpl(
          __typename = __typename!!,
          name = name!!,
          primaryFunction = primaryFunction
        )
      }
    }
  }
}
