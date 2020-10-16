// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_used_twice.fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.example.fragment_used_twice.type.CustomType
import kotlin.Any
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object CharacterDetails_ResponseAdapter : ResponseAdapter<CharacterDetails> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forString("__typename", "__typename", null, false, null),
    ResponseField.forString("name", "name", null, false, null),
    ResponseField.forCustomType("birthDate", "birthDate", null, false, CustomType.DATE, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): CharacterDetails {
    return DefaultImpl_ResponseAdapter.fromResponse(reader, __typename)
  }

  object DefaultImpl_ResponseAdapter : ResponseAdapter<CharacterDetails.DefaultImpl> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forCustomType("birthDate", "birthDate", null, false, CustomType.DATE, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        CharacterDetails.DefaultImpl {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var birthDate: Any? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> birthDate = readCustomType<Any>(RESPONSE_FIELDS[2] as ResponseField.CustomTypeField)
            else -> break
          }
        }
        CharacterDetails.DefaultImpl(
          __typename = __typename!!,
          name = name!!,
          birthDate = birthDate!!
        )
      }
    }
  }
}
