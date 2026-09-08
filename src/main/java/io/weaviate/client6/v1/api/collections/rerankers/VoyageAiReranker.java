package io.weaviate.client6.v1.api.collections.rerankers;

import java.util.function.Function;

import com.google.gson.annotations.SerializedName;

import io.weaviate.client6.v1.api.collections.Reranker;
import io.weaviate.client6.v1.internal.ObjectBuilder;

public record VoyageAiReranker(
    @SerializedName("model") String model) implements Reranker {

  // Current-generation models. See https://docs.voyageai.com/docs/reranker
  public static final String RERANK_3 = "rerank-3";
  public static final String RERANK_3_LITE = "rerank-3-lite";
  public static final String RERANK_2_5 = "rerank-2.5";
  public static final String RERANK_2_5_LITE = "rerank-2.5-lite";

  // Legacy models (still accessible, superseded by the models above).
  public static final String RERANK_2 = "rerank-2";
  public static final String RERANK_LITE_2 = "rerank-2-lite";
  public static final String RERANK_1 = "rerank-1";
  public static final String RERANK_LITE_1 = "rerank-lite-1";

  @Override
  public Kind _kind() {
    return Reranker.Kind.VOYAGEAI;
  }

  @Override
  public Object _self() {
    return this;
  }

  public static VoyageAiReranker of() {
    return of(ObjectBuilder.identity());
  }

  public static VoyageAiReranker of(Function<Builder, ObjectBuilder<VoyageAiReranker>> fn) {
    return fn.apply(new Builder()).build();
  }

  public VoyageAiReranker(Builder builder) {
    this(builder.model);
  }

  public static class Builder implements ObjectBuilder<VoyageAiReranker> {
    private String model;

    public Builder model(String model) {
      this.model = model;
      return this;
    }

    @Override
    public VoyageAiReranker build() {
      return new VoyageAiReranker(this);
    }
  }
}
