// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_used_twice

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.apollographql.apollo.api.internal.Throws
import com.example.fragment_used_twice.fragment.CharacterDetails
import com.example.fragment_used_twice.fragment.HeroDetails
import com.example.fragment_used_twice.fragment.HumanDetails
import com.example.fragment_used_twice.type.CustomType
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class TestQuery : Query<TestQuery.Data, Operation.Variables> {
  override fun operationId(): String {
    return OPERATION_ID
  }

  override fun queryDocument(): String {
    return QUERY_DOCUMENT
  }

  override fun variables(): Operation.Variables {
    return Operation.EMPTY_VARIABLES
  }

  override fun name(): OperationName {
    return OPERATION_NAME
  }

  override fun responseFieldMapper(): ResponseFieldMapper<TestQuery.Data> {
    return ResponseFieldMapper.invoke {
      TestQuery_ResponseAdapter.fromResponse(it)
    }
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters):
      Response<TestQuery.Data> {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters):
      Response<TestQuery.Data> {
    return parse(Buffer().write(byteString), scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<TestQuery.Data> {
    return parse(source, DEFAULT)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<TestQuery.Data> {
    return parse(byteString, DEFAULT)
  }

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString {
    return OperationRequestBodyComposer.compose(
      operation = this,
      autoPersistQueries = false,
      withQueryDocument = true,
      scalarTypeAdapters = scalarTypeAdapters
    )
  }

  override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  data class HeroDetailsCharacterDetailsImpl(
    override val __typename: String,
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The date character was born.
     */
    override val birthDate: Any
  ) : HeroDetails, CharacterDetails, TestQuery.Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@HeroDetailsCharacterDetailsImpl.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@HeroDetailsCharacterDetailsImpl.name)
        writer.writeCustom(RESPONSE_FIELDS[2] as ResponseField.CustomTypeField,
            this@HeroDetailsCharacterDetailsImpl.birthDate)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forCustomType("birthDate", "birthDate", null, false, CustomType.DATE, null)
      )
    }
  }

  data class HeroDetailsHumanDetailsCharacterDetailsImpl(
    override val __typename: String,
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The date character was born.
     */
    override val birthDate: Any
  ) : HeroDetails, HumanDetails, CharacterDetails, TestQuery.Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0],
            this@HeroDetailsHumanDetailsCharacterDetailsImpl.__typename)
        writer.writeString(RESPONSE_FIELDS[1],
            this@HeroDetailsHumanDetailsCharacterDetailsImpl.name)
        writer.writeCustom(RESPONSE_FIELDS[2] as ResponseField.CustomTypeField,
            this@HeroDetailsHumanDetailsCharacterDetailsImpl.birthDate)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forCustomType("birthDate", "birthDate", null, false, CustomType.DATE, null)
      )
    }
  }

  /**
   * A character from the Star Wars universe
   */
  data class OtherHero(
    override val __typename: String = "Character"
  ) : TestQuery.Hero {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@OtherHero.__typename)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null)
      )
    }
  }

  /**
   * A character from the Star Wars universe
   */
  interface Hero {
    val __typename: String

    fun asHeroDetails(): HeroDetails? = this as? HeroDetails

    fun asCharacterDetails(): CharacterDetails? = this as? CharacterDetails

    fun asHumanDetails(): HumanDetails? = this as? HumanDetails

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    val hero: TestQuery.Hero?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeObject(RESPONSE_FIELDS[0], this@Data.hero?.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forObject("hero", "hero", null, true, null)
      )
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "0717d3202204df80ffc6546a0b8dd179f40c29c183ebbea21e7c16ae27e0d056"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  hero {
          |    __typename
          |    ...HeroDetails
          |    ...HumanDetails
          |  }
          |}
          |fragment HeroDetails on Character {
          |  __typename
          |  name
          |  ...CharacterDetails
          |}
          |fragment HumanDetails on Human {
          |  __typename
          |  name
          |  ...CharacterDetails
          |}
          |fragment CharacterDetails on Character {
          |  __typename
          |  name
          |  birthDate
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String {
        return "TestQuery"
      }
    }
  }
}
