/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.annotation;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

/**
 * Extension of the {@link org.springframework.beans.factory.support.GenericBeanDefinition}
 * class, based on an ASM ClassReader, with support for annotation metadata exposed
 * through the {@link AnnotatedBeanDefinition} interface.
 *
 * <p>This class does <i>not</i> load the bean {@code Class} early.
 * It rather retrieves all relevant metadata from the ".class" file itself,
 * parsed with the ASM ClassReader. It is functionally equivalent to
 * {@link AnnotatedGenericBeanDefinition#AnnotatedGenericBeanDefinition(AnnotationMetadata)}
 * but distinguishes by type beans that have been <em>scanned</em> vs those that have
 * been otherwise registered or detected by other means.
 *
 * @author Juergen Hoeller
 * @author Chris Beams
 * @since 2.5
 * @see #getMetadata()
 * @see #getBeanClassName()
 * @see org.springframework.core.type.classreading.MetadataReaderFactory
 * @see AnnotatedGenericBeanDefinition
 */
@SuppressWarnings("serial")
public class ScannedGenericBeanDefinition extends GenericBeanDefinition implements AnnotatedBeanDefinition {

	/**
	 * CachingMetadataReaderFactory 构造的 metadata
	 *
	 * metadata 包含了类中的所有的信息（接口啊，方法啊，注解啊，属性啊等等）
	 */
	private final AnnotationMetadata metadata;


	/**
	 * 该类继承了GenericBeanDefinition，构造器是对metadata进行赋值。
	 * 类里面的全部信息，都包装在metadata里面。
	 *
	 * Create a new ScannedGenericBeanDefinition for the class that the
	 * given MetadataReader describes.
	 * @param metadataReader the MetadataReader for the scanned target class
	 */
	public ScannedGenericBeanDefinition(MetadataReader metadataReader) {
		Assert.notNull(metadataReader, "MetadataReader must not be null");
		/**
		 * 类啊方法啊的狗屁信息都给了 ScannedGenericBeanDefinition 对象。
		 */
		this.metadata = metadataReader.getAnnotationMetadata();
		/**
		 * 设置bean的class类的名称
		 */
		setBeanClassName(this.metadata.getClassName());
	}


	@Override
	public final AnnotationMetadata getMetadata() {
		return this.metadata;
	}

	@Override
	@Nullable
	public MethodMetadata getFactoryMethodMetadata() {
		return null;
	}

}
