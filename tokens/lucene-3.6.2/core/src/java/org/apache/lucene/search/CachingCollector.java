package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
RamUsageEstimator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
CachingCollector	TokenNameIdentifier
extends	TokenNameextends
Collector	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
MAX_ARRAY_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
512	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
1024	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
INITIAL_ARRAY_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
128	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
EMPTY_INT_ARRAY	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
SegStart	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
base	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
end	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SegStart	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
base	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
reader	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
base	TokenNameIdentifier
=	TokenNameEQUAL
base	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
end	TokenNameIdentifier
=	TokenNameEQUAL
end	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
CachedScorer	TokenNameIdentifier
extends	TokenNameextends
Scorer	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
score	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
CachedScorer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
(	TokenNameLPAREN
Weight	TokenNameIdentifier
)	TokenNameRPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
float	TokenNamefloat
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
score	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
advance	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
float	TokenNamefloat
freq	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
ScoreCachingCollector	TokenNameIdentifier
extends	TokenNameextends
CachingCollector	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
CachedScorer	TokenNameIdentifier
cachedScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
cachedScores	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
curScores	TokenNameIdentifier
;	TokenNameSEMICOLON
ScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
maxRAMMB	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxRAMMB	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CachedScorer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
curScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
128	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedScores	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
curScores	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CachedScorer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
curScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
INITIAL_ARRAY_SIZE	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedScores	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
curScores	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
collect	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
=	TokenNameEQUAL
scorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
upto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
base	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
nextLength	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextLength	TokenNameIdentifier
>	TokenNameGREATER
MAX_ARRAY_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextLength	TokenNameIdentifier
=	TokenNameEQUAL
MAX_ARRAY_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
base	TokenNameIdentifier
+	TokenNamePLUS
nextLength	TokenNameIdentifier
>	TokenNameGREATER
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextLength	TokenNameIdentifier
=	TokenNameEQUAL
maxDocsToCache	TokenNameIdentifier
-	TokenNameMINUS
base	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextLength	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
curScores	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
cachedSegs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScores	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
=	TokenNameEQUAL
scorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
nextLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
curScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
nextLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedScores	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
curScores	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
curDocs	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
=	TokenNameEQUAL
curScores	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
scorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
replay	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
replayInit	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
curUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
curBase	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
chunkUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_INT_ARRAY	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
SegStart	TokenNameIdentifier
seg	TokenNameIdentifier
:	TokenNameCOLON
cachedSegs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
other	TokenNameIdentifier
.	TokenNameDOT
setNextReader	TokenNameIdentifier
(	TokenNameLPAREN
seg	TokenNameIdentifier
.	TokenNameDOT
reader	TokenNameIdentifier
,	TokenNameCOMMA
seg	TokenNameIdentifier
.	TokenNameDOT
base	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
cachedScorer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
curBase	TokenNameIdentifier
+	TokenNamePLUS
curUpto	TokenNameIdentifier
<	TokenNameLESS
seg	TokenNameIdentifier
.	TokenNameDOT
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
curUpto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
curBase	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
chunkUpto	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
curScores	TokenNameIdentifier
=	TokenNameEQUAL
cachedScores	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
chunkUpto	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
chunkUpto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
curUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
=	TokenNameEQUAL
curScores	TokenNameIdentifier
[	TokenNameLBRACKET
curUpto	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedScorer	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
=	TokenNameEQUAL
curDocs	TokenNameIdentifier
[	TokenNameLBRACKET
curUpto	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
[	TokenNameLBRACKET
curUpto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
scorer	TokenNameIdentifier
=	TokenNameEQUAL
scorer	TokenNameIdentifier
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
cachedScorer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isCached	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"CachingCollector ("	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
base	TokenNameIdentifier
+	TokenNamePLUS
upto	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" docs & scores cached)"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
"CachingCollector (cache was cleared)"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
NoScoreCachingCollector	TokenNameIdentifier
extends	TokenNameextends
CachingCollector	TokenNameIdentifier
{	TokenNameLBRACE
NoScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
maxRAMMB	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxRAMMB	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
NoScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
collect	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
upto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
base	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
nextLength	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextLength	TokenNameIdentifier
>	TokenNameGREATER
MAX_ARRAY_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextLength	TokenNameIdentifier
=	TokenNameEQUAL
MAX_ARRAY_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
base	TokenNameIdentifier
+	TokenNamePLUS
nextLength	TokenNameIdentifier
>	TokenNameGREATER
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextLength	TokenNameIdentifier
=	TokenNameEQUAL
maxDocsToCache	TokenNameIdentifier
-	TokenNameMINUS
base	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextLength	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
cachedSegs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
nextLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
curDocs	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
replay	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
replayInit	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
curUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
curbase	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
chunkUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_INT_ARRAY	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
SegStart	TokenNameIdentifier
seg	TokenNameIdentifier
:	TokenNameCOLON
cachedSegs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
other	TokenNameIdentifier
.	TokenNameDOT
setNextReader	TokenNameIdentifier
(	TokenNameLPAREN
seg	TokenNameIdentifier
.	TokenNameDOT
reader	TokenNameIdentifier
,	TokenNameCOMMA
seg	TokenNameIdentifier
.	TokenNameDOT
base	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
curbase	TokenNameIdentifier
+	TokenNamePLUS
curUpto	TokenNameIdentifier
<	TokenNameLESS
seg	TokenNameIdentifier
.	TokenNameDOT
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
curUpto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
curbase	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
curDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
chunkUpto	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
chunkUpto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
curUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
other	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
[	TokenNameLBRACKET
curUpto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
other	TokenNameIdentifier
.	TokenNameDOT
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
scorer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isCached	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"CachingCollector ("	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
base	TokenNameIdentifier
+	TokenNamePLUS
upto	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" docs cached)"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
"CachingCollector (cache was cleared)"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
final	TokenNamefinal
Collector	TokenNameIdentifier
other	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
int	TokenNameint
maxDocsToCache	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
SegStart	TokenNameIdentifier
>	TokenNameGREATER
cachedSegs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
SegStart	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
cachedDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
IndexReader	TokenNameIdentifier
lastReader	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
curDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
base	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
lastDocBase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
CachingCollector	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
boolean	TokenNameboolean
acceptDocsOutOfOrder	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
cacheScores	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
maxRAMMB	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Collector	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Collector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
acceptsDocsOutOfOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
acceptDocsOutOfOrder	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
collect	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setNextReader	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docBase	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
create	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
cacheScores	TokenNameIdentifier
,	TokenNameCOMMA
maxRAMMB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
CachingCollector	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
cacheScores	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
maxRAMMB	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
cacheScores	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
ScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxRAMMB	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
new	TokenNamenew
NoScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxRAMMB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
CachingCollector	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
cacheScores	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
cacheScores	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
ScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
new	TokenNamenew
NoScoreCachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
,	TokenNameCOMMA
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
maxRAMMB	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
cacheScores	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
other	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
INITIAL_ARRAY_SIZE	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
bytesPerDoc	TokenNameIdentifier
=	TokenNameEQUAL
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_INT	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cacheScores	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
bytesPerDoc	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_FLOAT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
maxDocsToCache	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
maxRAMMB	TokenNameIdentifier
*	TokenNameMULTIPLY
1024	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
1024	TokenNameIntegerLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
bytesPerDoc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CachingCollector	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxDocsToCache	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
other	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
curDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
INITIAL_ARRAY_SIZE	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cachedDocs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
curDocs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
maxDocsToCache	TokenNameIdentifier
=	TokenNameEQUAL
maxDocsToCache	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
acceptsDocsOutOfOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
other	TokenNameIdentifier
.	TokenNameDOT
acceptsDocsOutOfOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isCached	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
curDocs	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setNextReader	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docBase	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
other	TokenNameIdentifier
.	TokenNameDOT
setNextReader	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
docBase	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lastReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cachedSegs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SegStart	TokenNameIdentifier
(	TokenNameLPAREN
lastReader	TokenNameIdentifier
,	TokenNameCOMMA
lastDocBase	TokenNameIdentifier
,	TokenNameCOMMA
base	TokenNameIdentifier
+	TokenNamePLUS
upto	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
lastDocBase	TokenNameIdentifier
=	TokenNameEQUAL
docBase	TokenNameIdentifier
;	TokenNameSEMICOLON
lastReader	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
replayInit	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isCached	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"cannot replay: cache was cleared because too much RAM was required"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
other	TokenNameIdentifier
.	TokenNameDOT
acceptsDocsOutOfOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
this	TokenNamethis
.	TokenNameDOT
other	TokenNameIdentifier
.	TokenNameDOT
acceptsDocsOutOfOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"cannot replay: given collector does not support "	TokenNameStringLiteral
+	TokenNamePLUS
"out-of-order collection, while the wrapped collector does. "	TokenNameStringLiteral
+	TokenNamePLUS
"Therefore cached documents may be out-of-order."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
lastReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cachedSegs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SegStart	TokenNameIdentifier
(	TokenNameLPAREN
lastReader	TokenNameIdentifier
,	TokenNameCOMMA
lastDocBase	TokenNameIdentifier
,	TokenNameCOMMA
base	TokenNameIdentifier
+	TokenNamePLUS
upto	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastReader	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
replay	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
